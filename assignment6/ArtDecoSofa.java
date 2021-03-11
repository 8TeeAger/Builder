package kz.aitu.oop.assignment6;

public class ArtDecoSofa implements iSofa{
    @Override
    public void hasLegs() {
        System.out.println("ArtDeco sofa has 4 legs;");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on artDeco sofa");
    }
}
