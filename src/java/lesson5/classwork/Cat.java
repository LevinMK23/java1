package lesson5.classwork;

public class Cat {

    //свойства Fields
    private String name;
    private int age;
    private static int counter = 0;

    @Override
    protected void finalize() throws Throwable {
        counter++;
        super.finalize();
    }

    public Cat(int age) {
        this.age = age;
        //counter++;
    }

    public Cat() {

    }

    public int getCounter() {
        return counter;
    }

    //getters and setters

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    //private - in class
    //'' - default (package private) - in package
    //protected pp + extension (по наследству)
    //public - everywhere
    public void say() {
        System.out.println(name + " MEOW");
    }

}
