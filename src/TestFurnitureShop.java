import java.util.Scanner;

public class TestFurnitureShop {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String tmp = scn.next();

        FurnitureShopAkaFactory obTest = new FurnitureShopAkaFactory();
        Furniture ob = obTest.getFurniture(tmp);
        System.out.println(ob);
        System.out.println("Furniture Func Test");
        ob.use();
    }
}
