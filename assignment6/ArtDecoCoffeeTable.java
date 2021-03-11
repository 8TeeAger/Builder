package kz.aitu.oop.assignment6;

public class ArtDecoCoffeeTable implements iCoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("artDeco coffee table has no legs;");
    }

    @Override
    public void sitOn() {
        System.out.println("you can't sit on artDeco coffee table");
    }
}
