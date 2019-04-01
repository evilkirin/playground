// Generated from /Users/zac-tse/Development/github/playground/src/main/resources/interp/AssemblerV2.g4 by ANTLR 4.7.2
package interp.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AssemblerV2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AssemblerV2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AssemblerV2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AssemblerV2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerV2Parser#globals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobals(AssemblerV2Parser.GlobalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerV2Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AssemblerV2Parser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoArgInst}
	 * labeled alternative in {@link AssemblerV2Parser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoArgInst(AssemblerV2Parser.NoArgInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleArgInst}
	 * labeled alternative in {@link AssemblerV2Parser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleArgInst(AssemblerV2Parser.SingleArgInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoArgsInst}
	 * labeled alternative in {@link AssemblerV2Parser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoArgsInst(AssemblerV2Parser.TwoArgsInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThreeArgsInst}
	 * labeled alternative in {@link AssemblerV2Parser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreeArgsInst(AssemblerV2Parser.ThreeArgsInstContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerV2Parser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(AssemblerV2Parser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link AssemblerV2Parser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(AssemblerV2Parser.LabelContext ctx);
}