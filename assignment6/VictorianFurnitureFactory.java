package kz.aitu.oop.assignment6;

public class VictorianFurnitureFactory implements FurnitureAbstractFactory{
    public iChair createChair() { return new VictorianChair(); }
    public iSofa createSofa() {
        return new VictorianSofa();
    }
    public iCoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
