public class Husky extends Dog{


    private boolean agressive;

    public Husky(int ann, int cute, boolean agressive) {
        this.annoyanceIndex = ann;
        this.cutenessIndex = cute;
        this.agressive=agressive;
    }
    @Override
    boolean isCute() {
        return cutenessIndex > 5 && !agressive;
    }

    @Override
    void bark() {
        if(isCute()) {
            System.out.println("teeny bark of husky");
        }
        if(isAnnoying()) {
            System.out.println("really annoying annoying bark of husky");

        }
    }

    @Override
    boolean isAnnoying() {
        return annoyanceIndex > 3 && agressive;
    }

    @Override
    public String toString() {
        return "Husky{" +
                "agressive=" + agressive +
                ", annoyanceIndex=" + annoyanceIndex +
                ", cutenessIndex=" + cutenessIndex +
                '}';
    }
}
