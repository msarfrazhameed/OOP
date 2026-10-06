public class HotDogStand {
    private int id;
    private int soldToday;

    public HotDogStand(int id, int soldToday) {
        this.id = id;
        this.soldToday = soldToday;
    }

    public void justSold() {
        this.soldToday++;
    }

    public int getId() {
        return this.id;
    }

    public int getSoldToday() {
        return this.soldToday;
    }

}
