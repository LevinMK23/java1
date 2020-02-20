package lesson6.classwork.inter;


public class ConsoleLogger extends Logger{

    @Override
    public void println(String message) {
        System.out.println(message);
    }
}
