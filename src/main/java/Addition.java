public class Addition extends Operator {

    private final String operator = "+";

    public Addition(){
        super();

    }

    @Override
    public String getExpressionElement(){
        return operator;
    }

    @Override
    public void acceptVisitor(ExpressionVisitor visitor){
        visitor.visitExpressionElement(this);
    }
}
