package lesson5.homework;

import java.util.ArrayList;
import lesson5.homework.Employee;
public class HomeWork {

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Petr Sergeevich", "director", "direct@mail.com", 45, 34565, 300000);
        persArray[1] = new Employee("Sergeev Ivan Sergeevich", "manager", "man@mail.com", 30, 34765, 150000);
        persArray[2] = new Employee("Ivanov Den Sergeevich", "junior manager", "ids@mail.com", 26, 34485, 110000);
        persArray[3] = new Employee("Sokol Alex Petrovich", "junior manager", "sap@mail.com", 24, 34539, 100000);
        persArray[4] = new Employee("Ivanova Elena Alexandrovna", "office manager", "iea@mail.com", 44, 34549, 90000);

        for (int i = 0; i <= 4; i++) {
            if (persArray[i].getAge() >= 40) persArray[i].show();
        }

            }



        }

