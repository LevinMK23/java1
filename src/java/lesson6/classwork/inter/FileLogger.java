package lesson6.classwork.inter;

import java.io.*;

public class FileLogger extends Logger {

    private File file;

    public FileLogger(File file) {
        this.file = file;
    }

    @Override
    public void simpleMethod() {
        PrintWriter pr = null;
        try {
            pr = new PrintWriter(new FileOutputStream(file, true));
            pr.println("WOW");
            pr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void println(String message) {
        PrintWriter pr = null;
        try {
            pr = new PrintWriter(new FileOutputStream(file, true));
            pr.println(message);
            pr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
