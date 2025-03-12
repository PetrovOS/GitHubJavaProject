package school.redrover.HW12.Task2;

abstract class StorageFurniture extends Furniture {
    private final int storageCapacity;

    public StorageFurniture(String material, String color, int storageCapacity) {
        super(material, color);
        this.storageCapacity = storageCapacity;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }
}
