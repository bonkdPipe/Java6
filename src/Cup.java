public class Cup extends Dish{

    private int weirdnessIndex;

    public Cup(String material, int breakIndex, String food, int weirdnessIndex) {
        this.weirdnessIndex = weirdnessIndex;
        this.material = material;
        this.food = food;
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

    void lookAtIt() {
        if(weirdnessIndex > 5) {
            System.out.println("you are astonished");
        } else {
            System.out.println("kinda bland");
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
        return "Cup{" +
                "weirdnessIndex=" + weirdnessIndex +
                ", material='" + material + '\'' +
                ", food='" + food + '\'' +
                ", breakApartnessIndex=" + breakApartnessIndex +
                '}';
    }
}
