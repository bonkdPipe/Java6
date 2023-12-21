public abstract class Furniture {

    protected String material;

    protected int repairIndex;
    protected int quality;

    abstract void use();

    abstract void breakApart();

    abstract void repair();
}
