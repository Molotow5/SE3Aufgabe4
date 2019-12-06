//Marcus Jan Almert, 119915
//Luigi Portwich, 119649
//Vladimir Spassov, 119606
//Sebastian Reichmann, 120450

public class TestMain {

    public static void main(String []args){

        Expression testExpression1 = new Expression();
        Expression testExpression2 = new Expression();
        Expression testExpression3 = new Expression();
        Literal five = new Literal(5);
        Literal two = new Literal(2);
        Literal three = new Literal(3);
        LeftBracket lb = new LeftBracket();
        RightBracket rb = new RightBracket();
        Addition add = new Addition();
        Multiplikation mult = new Multiplikation();
        testExpression1.addNewExpressionElement(five);
        testExpression2.addNewExpressionElement(lb);
        testExpression2.addNewExpressionElement(two);
        testExpression2.addNewExpressionElement(add);
        testExpression2.addNewExpressionElement(three);
        testExpression2.addNewExpressionElement(rb);
        testExpression3.addNewExpressionElement(lb);
        testExpression3.addNewExpressionElement(two);
        testExpression3.addNewExpressionElement(add);
        testExpression3.addNewExpressionElement(three);
        testExpression3.addNewExpressionElement(rb);
        testExpression3.addNewExpressionElement(mult);
        testExpression3.addNewExpressionElement(five);

        EvalVisitor eva = new EvalVisitor();
        PrettyPrintVisitor prett = new PrettyPrintVisitor();
        EvalVisitor eva1 = new EvalVisitor();
        PrettyPrintVisitor prett1 = new PrettyPrintVisitor();
        EvalVisitor eva2 = new EvalVisitor();
        PrettyPrintVisitor prett2 = new PrettyPrintVisitor();

        testExpression1.acceptVisitor(eva);
        System.out.println(eva.getResult());   //5
        testExpression1.acceptVisitor(prett);  //5
        testExpression2.acceptVisitor(eva1);
        System.out.println(eva1.getResult());  //5
        testExpression2.acceptVisitor(prett1); //(2+3)
        testExpression3.acceptVisitor(eva2);
        System.out.println(eva2.getResult());  //25
        testExpression3.acceptVisitor(prett2); //(2+3)*6
    }
}
