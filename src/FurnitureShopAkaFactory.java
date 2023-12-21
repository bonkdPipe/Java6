import java.util.Scanner;

enum furnitures {
    CHAIR,SOFA,TABLE
}

public class FurnitureShopAkaFactory {

    Scanner scn = new Scanner(System.in);
    public Furniture getFurniture(String furniture) {

        furnitures type;

        if (furniture.equals("chair")) {
            type = furnitures.CHAIR;
        } else if(furniture.equals("sofa")) {
            type = furnitures.SOFA;
        } else if(furniture.equals("table")) {
            type = furnitures.TABLE;
        } else {
            System.out.println("Defaulting to chair: ");
            type = furnitures.CHAIR;
        }



        if(type == furnitures.CHAIR) {
            System.out.println("Pick your chair");
            return new Chair(scn.nextBoolean(), scn.nextInt(),scn.nextInt(),scn.next());
        } else if(type == furnitures.SOFA) {
            System.out.println("Pick your sofa");
            return new Sofa(scn.nextInt(), scn.nextInt(),scn.nextInt(),scn.next());
        } else if(type == furnitures.TABLE) {
            System.out.println("Pick your table");
            return new Sofa(scn.nextInt(), scn.nextInt(),scn.nextInt(),scn.next());
        }
        return null;
    }
}
