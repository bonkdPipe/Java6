public abstract class Dish {

    protected String material;

    protected String food;

    protected int breakApartnessIndex;

    abstract void breakApart();
    abstract void putFood(String food);

    abstract String whatFood();
    abstract void repaint(String paintJob);
}
