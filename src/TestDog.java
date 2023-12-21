public class TestDog {
    public static void main(String[] args) {
        Labradoodle lrbdl = new Labradoodle(5,10,9999);
        Husky hsk = new Husky(7,2,true);

        System.out.println("Labradoodle func: ");
        System.out.println("isAnnoying result: ");
        lrbdl.isAnnoying();
        System.out.println("isCute func result: ");
        lrbdl.isCute();
        System.out.println("Bark func result: ");
        lrbdl.bark();
        System.out.println(lrbdl);
        System.out.println("Husky func: ");
        System.out.println("isAnnoying result: ");
        hsk.isAnnoying();
        System.out.println("isCute func result: ");
        hsk.isCute();
        System.out.println("Bark func result: ");
        hsk.bark();
        System.out.println(hsk);
    }
}
