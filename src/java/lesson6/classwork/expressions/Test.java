package lesson6.classwork.expressions;

import javafx.scene.control.TreeTableColumn;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Expression sum = new Sum(new Sum(new Const(1), new Const(2)),
                new Sum(new Const(1),
                        new Multiply(
                                new Sum(new Const(4), new Const(5)),
                                new Const(2))));
        System.out.println(sum + " = " + sum.evalute());
        Object o = new ArrayList<>();
    }
}
