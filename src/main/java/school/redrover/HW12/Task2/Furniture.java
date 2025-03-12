package school.redrover.HW12.Task2;

abstract class Furniture {
    private final String material;
    private final String color;

    public Furniture (String material, String color) {
        this.material = material;
        this.color = color;
    }

    public String getInfo() {
        return "Material: " + material + ", Color: " + color;
    }
}
