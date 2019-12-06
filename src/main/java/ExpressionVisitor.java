import javax.script.ScriptException;

public abstract class ExpressionVisitor {

    protected int leftBracketsCounter;
    protected int rightBracketsCounter;
    protected boolean syntaxCheck;
    protected String expression;

    public ExpressionVisitor(){
        leftBracketsCounter = 0;
        rightBracketsCounter = 0;
        syntaxCheck = true;
        expression = "";
    }

    public void visitExpressionElement(ExpressionElement expel){
        switch (expel.getElementID()) {
            case 0:
                if (expel.getExpressionElement().equals("(")) {
                    if (expression.length() > 1 && ")".equals(expression.charAt(expression.length() -1))){
                        syntaxCheck = false;
                    }
                    leftBracketsCounter++;
                } else if (expel.getExpressionElement().equals(")")){
                    if (expression.length() > 1 && ("+".equals(expression.charAt(expression.length() -1)) || "*".equals(expression.charAt(expression.length() -1)))){
                        syntaxCheck = false;
                    }
                    rightBracketsCounter++;
                }

                break;
            case 1:
                if (expression.length() > 1 && ")".equals(expression.charAt(expression.length() -1))){
                    syntaxCheck = false;
                }
            case 2:
                if (expression.length() > 1 && "(".equals(expression.charAt(expression.length() -1))){
                    syntaxCheck = false;
                }
                break;
        }
        expression = expression + expel.getExpressionElement();
    }

    public void clearVisitor(){
        expression = "";
        leftBracketsCounter = 0;
        rightBracketsCounter = 0;
        syntaxCheck = true;
    }

    public abstract void finishedVisit() throws ScriptException;
}
