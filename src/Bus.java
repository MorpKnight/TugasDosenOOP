public class Bus {
    private int id;
    public String driver;
    public Track track;
    public int capacity;

    public Bus(int id, String driver, Track track, int capacity) {
        this.id = id;
        this.driver = driver;
        this.track = track;
        this.capacity = capacity;
    }

    public void doneTrip(){
        System.out.println("Bus " + this.id + " has done trip");
    }

    public void getTrackInfo(){
        System.out.println("Bus ini melayani halte ");
        for(Track t: Track.values()){
            System.out.println(t);
        }
    }

    public String gantiDriver(String newDriver){
        this.driver = newDriver;
        return this.driver;
    }

    public void setCapacity(int newCapacity){
        this.capacity = newCapacity;
    }
}
