public class Literal extends ExpressionElement {

    private String literal;

    public Literal(){
        elementID = 1;
        literal = "";
    }

    public Literal(int newLiteral){
        elementID = 1;
        literal = String.valueOf(newLiteral);
    }

    @Override
    public String getExpressionElement(){
        return literal;
    }

    @Override
    public void acceptVisitor(ExpressionVisitor visitor){
        visitor.visitExpressionElement(this);
    }
}
