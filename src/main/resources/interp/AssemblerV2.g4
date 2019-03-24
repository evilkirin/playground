/** A generic bytecode assembler whose instructions take 0..3 operands.
 *  Instruction set is dictated externally with a String[].  Implement
 *  specifics by subclassing and defining gen() methods. Comments start
 *  with ';' and all instructions end with '\n'.  Handles both register (rN)
 *  and stack-based assembly instructions.  Labels are "ID:".  "main:" label
 *  is where we start execution.  Use .globals and .def for global data
 *  and function definitions, respectively.
 */
grammar AssemblerV2;

program
    :   globals?
        ( functionDeclaration | instr | label | NEWLINE )+
    ;
   
// how much data space
// START: data
globals : NEWLINE* '.globals' INT NEWLINE;
// END: data

//  .def fact: args=1, locals=0
// START: func
functionDeclaration
    :   '.def' ID ':' 'args' '=' INT ',' 'locals' '=' INT NEWLINE
    ;
// END: func

// START: instr
instr
    :   ID NEWLINE                                  #NoArgInst
    |   ID operand NEWLINE                          #SingleArgInst
    |   ID operand ',' operand NEWLINE              #TwoArgsInst
    |   ID operand ',' operand ',' operand NEWLINE  #ThreeArgsInst
    ;
// END: instr

// START: operand
operand
    :   ID   // basic code label; E.g., "loop"
    |   REG  // register name; E.g., "r0"
    |   FUNC // function label; E.g., "f()"
    |   INT
// ...
// END: operand
    |   CHAR
    |   STRING
    |   FLOAT
    ;

label
    :   ID ':' ;

REG :   'r' INT ;

ID  :   LETTER (LETTER | '0'..'9')* ;

FUNC:   ID '()';

fragment
LETTER
    :   ('a'..'z' | 'A'..'Z')
    ;
    
INT :   '-'? '0'..'9'+ ;

CHAR:   '\'' . '\'' ;

STRING: '"' STR_CHARS '"';

fragment STR_CHARS : ~'"'* ;

FLOAT
    :   INT '.' INT*
    |   '.' INT+
    ;

WS  :   (' '|'\t')+ -> skip;

NEWLINE
    :   (';' .*?)? '\r'? '\n'  // optional comment followed by newline
    ;
