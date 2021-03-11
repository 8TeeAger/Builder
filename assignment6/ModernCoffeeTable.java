package kz.aitu.oop.assignment6;

public class ModernCoffeeTable implements iCoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("Modern coffee table has 4 legs;");
    }

    @Override
    public void sitOn() {
        System.out.println("You can't sit on Modern coffee table");
    }
}
