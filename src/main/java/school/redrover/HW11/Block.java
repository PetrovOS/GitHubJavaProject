package school.redrover.HW11;

//    Task 2 (11.1)
public class Block {

    private int[] blocks;

    public Block (int[] blocks) {
        this.blocks = blocks;
    }

    public int getWidth() {
        return blocks[0];
    }

    public int getLength() {
        return blocks[1];
    }

    public int getHeight() {
        return blocks[2];
    }

    public int getVolume() {
        return getWidth() * getLength() * getHeight();
    }

    public int getSurfaceArea() {
        return 2 * (getLength() * getWidth() + getWidth() * getHeight() + getLength() * getHeight());
    }
}
