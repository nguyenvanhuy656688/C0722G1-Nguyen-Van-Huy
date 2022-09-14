package ss7_abstract_interface.comparator.practice.animal.animal;

import ss7_abstract_interface.comparator.practice.animal.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "O ó ooo";
    }

    @Override
    public String howToEat() {
        return "cuối xuống ăn";
    }
}
