package lesson6.classwork.override;

public abstract class Animal implements Run, Jump {

    String name;

    public Animal(String name) {
        this.name = name;
    }
}
