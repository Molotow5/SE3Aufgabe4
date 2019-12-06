import javax.script.ScriptException;
import java.util.ArrayList;

public class Expression {

    private ArrayList<ExpressionElement> expElements;

    public Expression(){
        expElements = new ArrayList<ExpressionElement>();
    }

    public void acceptVisitor(ExpressionVisitor visitor){
        for (int i = 0; i < expElements.size(); i++){
            expElements.get(i).acceptVisitor(visitor);
        }
        try {
            visitor.finishedVisit();
        } catch (ScriptException e){
            System.out.println("ScriptExcpetion error in EvalVisitor.java");
        }
    }

    public void addNewExpressionElement(ExpressionElement newElement){
        expElements.add(newElement);
    }
}
