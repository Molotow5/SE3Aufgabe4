public class Test2Main {

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

        testExpression1.addNewExpressionElement(add);
        testExpression1.addNewExpressionElement(mult);

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

        String testString = testExpression3.getFullExpression();
        System.out.println("getFullExpression memberfuction test: " + testString);

        testExpression1.acceptVisitor(prett);
        testExpression1.acceptVisitor(eva);
        System.out.println(eva.getResult());

        Expression testExpression4 = new Expression();

        testExpression4.addNewExpressionElement(lb);
        testExpression4.addNewExpressionElement(five);
        testExpression4.addNewExpressionElement(add);
        testExpression4.addNewExpressionElement(three);
        testExpression4.addNewExpressionElement(rb);
        testExpression4.addNewExpressionElement(rb);

        testExpression4.acceptVisitor(prett1);
        testExpression4.acceptVisitor(eva1);

        eva.clearVisitor();
        prett.clearVisitor();
        System.out.println(eva.getResult() == 0);

    }
}
