public class Furniture {
    private String material;
    private int numberOfLegs;
    private String colour;

    public Furniture(String initialMaterial, int initialNumberOfLegs, String initialColour) {
        material = initialMaterial;
        numberOfLegs = initialNumberOfLegs;
        colour = initialColour;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }
    
    public void setColour(String newColour) {
        colour = newColour;
    }
    
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    
    public static void main(String[] args) {
        Furniture coolFurniture = new Furniture("wood", 4, "blue");

        System.out.println(coolFurniture.getMaterial());
        System.out.println(coolFurniture.getColour());
        System.out.println(coolFurniture.getNumberOfLegs());
        coolFurniture.setColour("pink");
        System.out.println(coolFurniture.getColour());

        Chair coolChair = new Chair("wood", 4, "blue", "20cm");
        System.out.println(coolChair.getMaterial());
        System.out.println(coolChair.getColour());
        System.out.println(coolChair.getNumberOfLegs());
        coolChair.setColour("pink");
        System.out.println(coolChair.getColour());
        System.out.println(coolChair.getPillowSize());
    }
}

class Chair extends Furniture {
    private String pillowSize;

    public Chair(String initialMaterial, int initialNumberOfLegs, String initialColour, String initialPillowSize) {
        super(initialMaterial, initialNumberOfLegs, initialColour);
        pillowSize = initialPillowSize;
    }

    public String getPillowSize() {
        return pillowSize;
    }
}