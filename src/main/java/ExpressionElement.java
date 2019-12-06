public abstract class ExpressionElement {

    protected int elementID;

    public ExpressionElement(){}

    public abstract String getExpressionElement();

    public abstract void acceptVisitor(ExpressionVisitor visitor);

    public int getElementID(){
        return elementID;
    }
}
