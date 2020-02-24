package lesson6.homework.animal4;

import lesson6.homework.animals3.MoveError;

public abstract class Animal {

    private String name;
    private int limit;

    public Animal(String name, int limit) {
        this.name = name;
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    void takeBarrier(Barrier barrier) {
        if (barrier.can(getLimit())) {
            System.out.println(name + " take barrier " + barrier);
        } else {
            throw new MoveError("cannot take this barrier");
        }
    }
}
