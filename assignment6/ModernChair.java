package kz.aitu.oop.assignment6;

public class ModernChair implements iChair {
    @Override
    public void hasLegs() {
        System.out.println("Modern chair has no legs;");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on Modern chair");
    }
}
