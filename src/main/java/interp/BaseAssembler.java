package interp;

import interp.antlr.AssemblerV2BaseListener;
import interp.antlr.AssemblerV2Parser;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

public abstract class BaseAssembler extends AssemblerV2BaseListener {

    protected abstract void gen(Token instrToken);

    protected abstract void gen(Token instrToken, Token operandToken);

    protected abstract void gen(Token instrToken, Token oToken1, Token oToken2);

    protected abstract void gen(Token instrToken, Token oToken1, Token oToken2, Token oToken3);

    protected abstract void checkForUnresolvedReferences();

    protected abstract void defineFunction(Token idToken, int nargs, int nlocals);

    protected abstract void defineDataSize(int n);

    protected abstract void defineLabel(Token idToken);

    @Override
    public void exitProgram(AssemblerV2Parser.ProgramContext ctx) {
        checkForUnresolvedReferences();
    }

    @Override
    public void exitGlobals(AssemblerV2Parser.GlobalsContext ctx) {
        defineDataSize(fromIntToken(ctx.INT()));
    }

    @Override
    public void exitFunctionDeclaration(AssemblerV2Parser.FunctionDeclarationContext ctx) {
        defineFunction(ctx.ID().getSymbol(), fromIntToken(ctx.INT(0)), fromIntToken(ctx.INT(1)));
    }

    @Override
    public void exitNoArgInst(AssemblerV2Parser.NoArgInstContext ctx) {
        gen(ctx.ID().getSymbol());
    }

    @Override
    public void exitSingleArgInst(AssemblerV2Parser.SingleArgInstContext ctx) {
        gen(ctx.ID().getSymbol(), ctx.operand().getStart());
    }

    @Override
    public void exitTwoArgsInst(AssemblerV2Parser.TwoArgsInstContext ctx) {
        gen(ctx.ID().getSymbol(), ctx.operand(0).getStart(), ctx.operand(1).getStart());
    }

    @Override
    public void exitThreeArgsInst(AssemblerV2Parser.ThreeArgsInstContext ctx) {
        gen(ctx.ID().getSymbol(), ctx.operand(0).getStart(), ctx.operand(1).getStart(), ctx.operand(2).getStart());
    }

    @Override
    public void exitLabel(AssemblerV2Parser.LabelContext ctx) {
        defineLabel(ctx.ID().getSymbol());
    }

    @Override
    public void exitOperand(AssemblerV2Parser.OperandContext ctx) {
        if (ctx.FUNC() != null) {
            TerminalNode func = ctx.FUNC();
            String text = func.getText();
            ((CommonToken) func.getSymbol()).setText(text.substring(0, text.length() - 2));
        }

        if (ctx.STRING() != null) {
            TerminalNode string = ctx.STRING();
            String text = string.getText();
            ((CommonToken) string.getSymbol()).setText(text.substring(1, text.length() - 1));
        }
    }

    public static int fromIntToken(TerminalNode node) {
        return Integer.parseInt(node.getSymbol().getText());
    }
}
