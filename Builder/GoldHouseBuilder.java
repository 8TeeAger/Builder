package Builder;

public class GoldHouseBuilder extends HouseBuilder{
    @Override
    void buildHouse() {
        house.setHouse("Golden");
    }

    @Override
    void buildHouseType() {
        house.setHouseType(HouseType.GOLDEN);
    }

    @Override
    void buildWalls() {
        house.setWalls(4);
    }

    @Override
    void buildDoors() {
        house.setDoors(2);
    }

    @Override
    void buildRoof() {
        house.setRoof("Diamond");
    }

    @Override
    void buildWindows() {
        house.setWindows(2);
    }

    @Override
    void buildGarage() {
        house.setGarage(true);
    }

    @Override
    void buildSwimmingPool() {
        house.setSwimmingPool(true);
    }

    @Override
    void buildFancyStatues() {
        house.setFancyStatues(true);
    }

    @Override
    void buildGarden() {
        house.setGarden(true);
    }
}
