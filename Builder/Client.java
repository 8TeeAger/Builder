package Builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new GoldHouseBuilder());
        House house = director.buildHouse();

        director.setBuilder(new WoodenHouseBuilder());
        House house1 = director.buildHouse();

        director.setBuilder(new StoneHouseBuilder());
        House house2 = director.buildHouse();

        System.out.println(house);
        System.out.println(house1);
        System.out.println(house2);
    }
}
