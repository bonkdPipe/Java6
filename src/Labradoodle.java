public class Labradoodle extends Dog{


    private int woolAmount;

    public Labradoodle(int ann, int cute, int woolAmount) {
        this.annoyanceIndex = ann;
        this.cutenessIndex = cute;
        this.woolAmount=woolAmount;
    }
    @Override
    boolean isCute() {
        return cutenessIndex > 5;
    }

    @Override
    void bark() {
        if(isCute()) {
            System.out.println("teeny bark");
        }
        if(isAnnoying()) {
            System.out.println("really freaking annoying");

        }
    }

    @Override
    boolean isAnnoying() {
        return annoyanceIndex > 3;
    }

    @Override
    public String toString() {
        return "Labradoodle{" +
                "woolAmount=" + woolAmount +
                ", annoyanceIndex=" + annoyanceIndex +
                ", cutenessIndex=" + cutenessIndex +
                '}';
    }
}
