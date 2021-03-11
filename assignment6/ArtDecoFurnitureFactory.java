package kz.aitu.oop.assignment6;

public class ArtDecoFurnitureFactory implements FurnitureAbstractFactory{
    @Override
    public iChair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public iSofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public iCoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
