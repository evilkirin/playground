// Generated from /Users/zac-tse/Development/github/playground/src/main/resources/interp/AssemblerV2.g4 by ANTLR 4.7.2
package interp.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssemblerV2Parser}.
 */
public interface AssemblerV2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssemblerV2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AssemblerV2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerV2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AssemblerV2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerV2Parser#globals}.
	 * @param ctx the parse tree
	 */
	void enterGlobals(AssemblerV2Parser.GlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerV2Parser#globals}.
	 * @param ctx the parse tree
	 */
	void exitGlobals(AssemblerV2Parser.GlobalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerV2Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AssemblerV2Parser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerV2Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AssemblerV2Parser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoArgInst}
	 * labeled alternative in {@link AssemblerV2Parser#instr}.
	 * @param ctx the parse tree
	 */
	void enterNoArgInst(AssemblerV2Parser.NoArgInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoArgInst}
	 * labeled alternative in {@link AssemblerV2Parser#instr}.
	 * @param ctx the parse tree
	 */
	void exitNoArgInst(AssemblerV2Parser.NoArgInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleArgInst}
	 * labeled alternative in {@link AssemblerV2Parser#instr}.
	 * @param ctx the parse tree
	 */
	void enterSingleArgInst(AssemblerV2Parser.SingleArgInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleArgInst}
	 * labeled alternative in {@link AssemblerV2Parser#instr}.
	 * @param ctx the parse tree
	 */
	void exitSingleArgInst(AssemblerV2Parser.SingleArgInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoArgsInst}
	 * labeled alternative in {@link AssemblerV2Parser#instr}.
	 * @param ctx the parse tree
	 */
	void enterTwoArgsInst(AssemblerV2Parser.TwoArgsInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoArgsInst}
	 * labeled alternative in {@link AssemblerV2Parser#instr}.
	 * @param ctx the parse tree
	 */
	void exitTwoArgsInst(AssemblerV2Parser.TwoArgsInstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThreeArgsInst}
	 * labeled alternative in {@link AssemblerV2Parser#instr}.
	 * @param ctx the parse tree
	 */
	void enterThreeArgsInst(AssemblerV2Parser.ThreeArgsInstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThreeArgsInst}
	 * labeled alternative in {@link AssemblerV2Parser#instr}.
	 * @param ctx the parse tree
	 */
	void exitThreeArgsInst(AssemblerV2Parser.ThreeArgsInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerV2Parser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(AssemblerV2Parser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerV2Parser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(AssemblerV2Parser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssemblerV2Parser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(AssemblerV2Parser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssemblerV2Parser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(AssemblerV2Parser.LabelContext ctx);
}