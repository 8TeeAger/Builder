package kz.aitu.oop.assignment6;

public class ModernFurnitureFactory implements FurnitureAbstractFactory{
    @Override
    public iChair createChair() {
        return new ModernChair();
    }

    @Override
    public iSofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public iCoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
