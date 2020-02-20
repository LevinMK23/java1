package lesson6.classwork.overload;

import lesson6.classwork.constructors.A;
import lesson6.classwork.constructors.B;
import lesson6.classwork.constructors.C;
import lesson6.classwork.inter.ConsoleLogger;
import lesson6.classwork.inter.FileLogger;
import lesson6.classwork.inter.Loggable;
import lesson6.classwork.inter.Logger;

import java.io.File;
import java.util.ArrayList;

public class Test extends A {

    public Test(int a) {
        super(a);
    }

    void foo(int arg) {
        System.out.println("Function with INT arg");
    }

//    static void foo(float arg) {
//        System.out.println("Function with FLOAT arg");
//    }

    void foo(double arg) {
        System.out.println("Function with DOUBLE arg = " + arg);
    }

    void foo(long arg) {
        System.out.println("Function with LONG arg = " + arg);
    }

    public static void main(String[] args) {
        Logger cl = new ConsoleLogger();
        Logger fl = new FileLogger(new File("src/java/lesson6/classwork/inter/out.txt"));
        cl.println("C OK");
        cl.simpleMethod();
        fl.println("F OK");
        fl.simpleMethod();
        Logger log = new Logger() {
            @Override
            public void println(String message) {
                System.out.println("NEW " + message);
            }
        };
        log.println("OK");
        Loggable logger = (msg) -> {
            System.out.println("LAMBDA + " + msg);
        };
        logger.println("LOL");
        System.out.println(logger.getClass());
    }
}
