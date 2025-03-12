package school.redrover.HW12.Task2;

abstract class SeatingFurniture extends Furniture {
    private final int seatingCapacity;


    public SeatingFurniture (String material, String color, int numberOfPlaces) {
        super(material, color);
        this.seatingCapacity = numberOfPlaces;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }
}
