public class Tablet extends Phone{
    public String type, brand;
    public int yearRelease, ram, rom, batteryCapacity;
    public double price;
    public boolean isAvailable, hasPen;

    public Tablet(String type, String brand, int yearRelease, int ram, int rom, int batteryCapacity, double price, boolean isAvailable, boolean hasPen) {
        super(type, brand, yearRelease, ram, rom, batteryCapacity, price, isAvailable);
        this.hasPen = hasPen;
    }

    public int getTabletAge() {
        return 2023 - this.yearRelease;
    }

    public boolean tabletIsAvailable() {
        return this.isAvailable;
    }

    public void openApp(String appName){
        System.out.println("Opening " + appName + "...");
    }

    public void closeApp(String appName){
        System.out.println("Closing " + appName + "...");
    }

    public void openPen(){
        System.out.println("Opening pen...");
    }

    public void closePen(){
        System.out.println("Closing pen...");
    }
}
