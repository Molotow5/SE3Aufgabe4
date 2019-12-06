import javax.script.ScriptEngineManager;
import  javax.script.ScriptEngine;
import javax.script.ScriptException;

public class EvalVisitor extends ExpressionVisitor {

    private double expressionResult;

    public  EvalVisitor(){
        super();
        expressionResult = 0;
    }

    @Override
    public void finishedVisit() throws ScriptException{
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        if (syntaxCheck && leftBracketsCounter != rightBracketsCounter){
            syntaxCheck = false;
        }
        if (syntaxCheck = false){
            System.out.println("syntax error in expression!");
        }
        Object result = engine.eval(expression);
        expressionResult = result.hashCode();
    }

    public double getResult(){
        return expressionResult;
    }

    @Override
    public void clearVisitor() {
        super.clearVisitor();
        expressionResult = 0;
    }
}
