public class HotDogStandRunner {
    public static void main(String[] args) {
        HotDogStand stand1 = new HotDogStand(101, 10);
        HotDogStand stand2 = new HotDogStand(102, 25);
        HotDogStand stand3 = new HotDogStand(103, 0);

        stand1.justSold();
        stand1.justSold();

        stand2.justSold();

        stand3.justSold();
        stand3.justSold();
        stand3.justSold();

        System.out.println("Stand " + stand1.getId() + " sold: " + stand1.getSoldToday());
        System.out.println("Stand " + stand2.getId() + " sold: " + stand2.getSoldToday());
        System.out.println("Stand " + stand3.getId() + " sold: " + stand3.getSoldToday());
    }
}
