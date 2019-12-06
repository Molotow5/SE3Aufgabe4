public class PrettyPrintVisitor extends ExpressionVisitor {

    public  PrettyPrintVisitor(){
        super();
    }

    @Override
    public void finishedVisit(){
        System.out.println("visited expression: " + expression + "\n");
    }
}
