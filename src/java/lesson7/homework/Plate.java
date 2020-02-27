package lesson7.homework;

public class Plate {

    private int foodCount = 0;

    public void addFood(int food) {
        foodCount += food;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void feed(int food) {
        if (food > foodCount) {
            addFood(100);
            System.out.println("Added 100 bits of food in plate");
        }
        foodCount -= food;
    }
}
