package lesson6.classwork.expressions;

public abstract class UnaryExpression implements Expression {

    Expression expression;

    public UnaryExpression(Expression expression) {
        this.expression = expression;
    }
}
