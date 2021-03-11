package kz.aitu.oop.assignment6;

public class ModernSofa implements iSofa {
    @Override
    public void hasLegs() {
        System.out.println("Modern sofa has no legs;");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on Modern sofa");
    }
}
