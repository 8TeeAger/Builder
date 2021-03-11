package kz.aitu.oop.assignment6;

public class VictorianSofa implements iSofa {
    @Override
    public void hasLegs() {
        System.out.println("Victorian sofa has 4 legs;");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on Victorian sofa");
    }
}
