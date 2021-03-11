package kz.aitu.oop.assignment6;

public class VictorianCoffeeTable implements iCoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("Victorian coffee table has 4 legs;");
    }

    @Override
    public void sitOn() {
        System.out.println("You can't sit on Victorian coffee table");
    }
}
