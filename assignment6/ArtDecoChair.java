package kz.aitu.oop.assignment6;

public class ArtDecoChair implements iChair{
    @Override
    public void hasLegs() {
        System.out.println("ArtDeco chair has 4 legs;");
    }

    @Override
    public void sitOn() {
        System.out.println("You can sit on ArtDeco chair");
    }
}
