package com.viswa.patterns.behavioralpatterns.interpreter;

public class NumberTeriminalExpression implements AbstractExpression {
    String value;

    //Teriminal Expression represents a variable
    public NumberTeriminalExpression(String value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return context.getVariable(value);
    }
}
