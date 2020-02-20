package lesson6.classwork.constructors;

public class B extends A {
    public int b;
    public B(int a, int b) {
        super(a);
        System.out.println("B created! for " + this);
    }
}
