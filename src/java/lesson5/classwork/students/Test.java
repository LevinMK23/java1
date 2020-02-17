package lesson5.classwork.students;

public class Test {
    // Информация о студентах учителя
    // Информация об учителях студента
    // Информация о предметах студента
    // Расписание студента : пердмет, время, учитель
    // Сделать две группы из 10 студентов каждая с различными расписаниями
    // математика 12:00 и математика 15:30 - разные объекты
    // 1 предмет для одного студента не могут вести два препода
    public static void main(String[] args) {
        Student s1 = new Student("Ivanov", "Ivan", "Ivanovich");
        Student s2 = new Student("Petrov", "Petr", "Ivanovich");
        Group group = new Group();
        group.schedule = new Schedule(group);
        Schedule schedule = group.schedule;
        s1.addToGroup(group);
        s2.addToGroup(group);
        Subject sub1 = new Subject("math", "12:00");
        Subject sub2 = new Subject("inf", "15:30");
        schedule.addSubject(sub1);
        schedule.addSubject(sub2);
        Teacher mathTeacher = new Teacher("Gleym", "Eric", "Hildson");
        Teacher infTeacher = new Teacher("Korotkevich", "Gennadiy", "Batkovich");
        sub1.applyTeacher(mathTeacher);
        sub2.applyTeacher(infTeacher);
        System.out.println(group.groupId);
        System.out.println(group.students);
        System.out.println(group.schedule);
        System.out.println(group.schedule.subjects.get(0).teachers);
        System.out.println(group.schedule.subjects.get(1).teachers);
        System.out.println(mathTeacher.subjects);
        System.out.println(mathTeacher.subjects.get(0).schedule.group.students);
        System.out.println(infTeacher.subjects);
        System.out.println(s1.getGroup().schedule.subjects.get(0).teachers.get(0));
        s1.showTeachersInfo();
    }
}
