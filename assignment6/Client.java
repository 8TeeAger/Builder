package kz.aitu.oop.assignment6;

public class Client {
    public static void main (String[] args) {
        FurnitureAbstractFactory FurAbsFact = new ArtDecoFurnitureFactory();
        iChair ArtChair = FurAbsFact.createChair();
        iSofa ArtSofa = FurAbsFact.createSofa();
        iCoffeeTable ArtCoffeeTable = FurAbsFact.createCoffeeTable();

        ArtChair.hasLegs();
        ArtChair.sitOn();

        ArtSofa.hasLegs();
        ArtSofa.sitOn();

        ArtCoffeeTable.hasLegs();
        ArtCoffeeTable.sitOn();
    }
}
