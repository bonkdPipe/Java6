public class Pot extends Dish{

    private int height;

    public Pot(String material, int breakIndex,String food, int height) {
        this.height = height;
        this.material =material;
        this.food= food;
        this.breakApartnessIndex=breakIndex;
    }

    @Override
    void breakApart() {
        if(breakApartnessIndex > 5) {
            System.out.println("how did you manage to break it?");
        } else if (breakApartnessIndex < 5) {
            System.out.println("that was easy, was it?");
        }
    }

    void putOn() {
        if(height > 5) {
            System.out.println("a worthy defensive pot");
        } else {
            System.out.println("you are better off without it");
        }
    }

    @Override
    void putFood(String food) {
        this.food =food;
    }

    @Override
    String whatFood() {
        return "this pot has " + food;
    }

    @Override
    void repaint(String paintJob) {
        this.material = paintJob;
    }


    @Override
    public String toString() {
        return "Pot{" +
                "height=" + height +
                ", material='" + material + '\'' +
                ", food='" + food + '\'' +
                ", breakApartnessIndex=" + breakApartnessIndex +
                '}';
    }
}
