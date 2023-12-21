import java.awt.*;

public class Chair extends Furniture {

    private boolean isBarStool;

    public Chair(boolean isBarStool, int quality,int repairIndex, String material) {
        this.material = material;
        this.quality = quality;
        this.repairIndex = repairIndex;
        this.isBarStool = isBarStool;
    }
    @Override
    void use() {
        if(isBarStool) {
            System.out.println("good luck soldier, you are too short for it");
        } else {
            System.out.println("you sit");
        }
    }

    @Override
    void breakApart() {
        if(quality < 5) {
            System.out.println("you broke a chair");
        } else {
            System.out.println("sturdy");
        }
    }

    @Override
    void repair() {
        if(repairIndex < 2) {
            System.out.println("good luck figuring out this ikea mess");
        } else {
            System.out.println("childs play");
        }
    }

    @Override
    public String toString() {
        return "Chair{" +
                "isBarStool=" + isBarStool +
                ", material='" + material + '\'' +
                ", repairIndex=" + repairIndex +
                ", quality=" + quality +
                '}';
    }
}
