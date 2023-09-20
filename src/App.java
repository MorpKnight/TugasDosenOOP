

public class App {
    public static void main(String[] args) throws Exception {
        Bus newBus = new Bus(1, "John", Track.BLOK_M, 10);
        newBus.getTrackInfo();

        newBus.gantiDriver("Doe");
        System.out.println(newBus.driver);
        newBus.getTrackInfo();
        newBus.setCapacity(30);
        System.out.println(newBus.getCapacity());
    }
}
