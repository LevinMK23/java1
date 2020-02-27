package lesson7.homework;

public class Test {
    public static void main(String[] args) {
        Plate plate = new Plate();
        plate.addFood(500);
        for (int i = 0; i < 30; i++) {
            new Thread(()-> new Cat()
                    .eat(plate)).start();
        }
    }
}
