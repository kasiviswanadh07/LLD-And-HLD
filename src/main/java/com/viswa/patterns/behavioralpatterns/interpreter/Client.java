package com.viswa.patterns.behavioralpatterns.interpreter;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setVariables("a", 12);
        context.setVariables("b", 5);
        context.setVariables("c", 7);
        context.setVariables("d", 3);
        System.out.println("Context " + context);

        AbstractExpression expression1 = new AddNonTerminalExpression(new NumberTeriminalExpression("a"), new NumberTeriminalExpression("b"));
        System.out.println("Expression: (a+b)= " + expression1.interpret(context));
        AbstractExpression expression2 = new MultiplyNonTerminalExpression(new NumberTeriminalExpression("c"), new NumberTeriminalExpression("d"));
        System.out.println("Expression: (c*d) = " +
                expression2.interpret(context));
        AbstractExpression expression3 = new MultiplyNonTerminalExpression(new AddNonTerminalExpression(new NumberTeriminalExpression("a")
                , new NumberTeriminalExpression("b")), new NumberTeriminalExpression("c"));
        System.out.println("Expression: (a+b)*c = " +
                expression3.interpret(context));
        // Expression: ((a*b) + (c*d))
         AbstractExpression expression4 = new
                BinaryNonTerminalExpression(
                 new BinaryNonTerminalExpression(new NumberTeriminalExpression("a"), new NumberTeriminalExpression("b"), '*'),
         new BinaryNonTerminalExpression(
                 new NumberTeriminalExpression("c"), new
                 NumberTeriminalExpression("d"), '*'),
         '+');
        System.out.println("Expression: ((a*b) + (c*d)) = " +
                expression4.interpret(context));
    }
}
