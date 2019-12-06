public class Multiplikation extends Operator {

    private final String operator = "*";

    public Multiplikation(){
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
