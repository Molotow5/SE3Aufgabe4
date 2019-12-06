public class RightBracket extends Brackets {

    private final String rightBracket = ")";

    public RightBracket(){
        super();
    }

    @Override
    public String getExpressionElement(){
        return rightBracket;
    }

    @Override
    public void acceptVisitor(ExpressionVisitor visitor){
        visitor.visitExpressionElement(this);
    }
}
