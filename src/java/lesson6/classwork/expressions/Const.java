package lesson6.classwork.expressions;

public class Const extends UnaryExpression {
    private int value;

    public Const(Expression expression) {
        super(expression);
    }
    public Const(int value) {
        super(null);
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public int evalute() {
        return value;
    }
}
