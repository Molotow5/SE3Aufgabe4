public class LeftBracket extends Brackets {

    private final String leftBracket = "(";

    public LeftBracket(){
        super();
    }

    @Override
    public String getExpressionElement(){
        return leftBracket;
    }

    @Override
    public void acceptVisitor(ExpressionVisitor visitor){
        visitor.visitExpressionElement(this);
    }
}
