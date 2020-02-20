package lesson5.homework;


public class Employee {
    private String fullName, position, email;
    private int age, tel, salary;

    public Employee(String fullName, String position, String email, int age, int tel, int salary) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.age = age;
        this.tel = tel;
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(fullName + " " + position + " " + email + " " + age + " " + tel + " " + salary);
    }
}
