public class Sofa extends Furniture {

    private int mattrassHeight;

    public Sofa(int mattrassHeight, int quality,int repairIndex, String material) {
        this.material = material;
        this.quality = quality;
        this.repairIndex = repairIndex;
        this.mattrassHeight = mattrassHeight;
    }
    @Override
    void use() {
        if(mattrassHeight > 5) {
            System.out.println("heavens");
        } else {
            System.out.println("hell");
        }
    }

    @Override
    void breakApart() {
        if(quality < 5) {
            System.out.println("you broke a sofa");
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
        return "Sofa{" +
                "mattrassHeight=" + mattrassHeight +
                ", material='" + material + '\'' +
                ", repairIndex=" + repairIndex +
                ", quality=" + quality +
                '}';
    }
}
