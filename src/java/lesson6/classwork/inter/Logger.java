package lesson6.classwork.inter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public abstract class Logger {
    private int value;
    public void simpleMethod() {
        System.out.println("WOW");
    }

    public abstract void println(String message);
}
