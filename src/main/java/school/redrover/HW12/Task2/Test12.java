package school.redrover.HW12.Task2;

public class Test12 {

    public static void main(String[] args) {
        SeatingFurniture chair = new Chair("Wood", "Brown");
        SeatingFurniture sofa = new Sofa("Leather", "Gray", 3);

        StorageFurniture cabinet = new Cabinet("Metal", "Red", 100);
        StorageFurniture wardrobe = new Wardrobe("Wood", "Oak", 300);

        System.out.println("Chair: " + chair.getInfo() + ", seats: " + chair.getSeatingCapacity());
        System.out.println("Sofa: " + sofa.getInfo() + ", seats: " + sofa.getSeatingCapacity());

        System.out.println("Cabinet: " + cabinet.getInfo() + ", Storage: " + cabinet.getStorageCapacity());
        System.out.println("Wardrobe: " + wardrobe.getInfo() + ", Storage: " + wardrobe.getStorageCapacity());
    }
}
