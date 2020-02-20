package lesson6.classwork.override;

import java.util.*;

public class Cat implements Run {

    @Override
    public void run() {
        System.out.println("I'm run");
    }

    @Override
    public void fastRun() {

    }

    public static void main(String[] args) {

    }
}
