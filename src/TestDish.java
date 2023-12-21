public class TestDish {
    public static void main(String[] args) {
        Pot pot = new Pot("clay",6,"apples",7);
        Cup cup = new Cup("glass", 3, "juice",9);

        System.out.println("Pot func: ");
        System.out.println("Put on func result: ");
        pot.putOn();
        System.out.println("Break apart func result: ");
        pot.breakApart();
        System.out.println(pot);
        System.out.println("Cup func: ");
        System.out.println("Break apart at func result: ");
        cup.lookAtIt();
        cup.breakApart();
        System.out.println(cup);


    }
}
