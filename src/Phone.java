public class Phone {
    public String type, brand;
    public int yearRelease, ram, rom, batteryCapacity;
    public double price;
    public boolean isAvailable;

    public Phone(String type, String brand, int yearRelease, int ram, int rom, int batteryCapacity, double price, boolean isAvailable) {
        this.type = type;
        this.brand = brand;
        this.yearRelease = yearRelease;
        this.ram = ram;
        this.rom = rom;
        this.batteryCapacity = batteryCapacity;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public int getPhoneAge() {
        int res = 2023 - this.yearRelease;
        if(res < 0){
            System.out.println("Phone hasn't been released yet!");
            return 0;
        }
        return 2023 - this.yearRelease;
    }

    public boolean phoneIsAvailable() {
        return this.isAvailable;
    }

    public void openApp(String appName){
        System.out.println("Opening " + appName + "...");
    }

    public void closeApp(String appName){
        System.out.println("Closing " + appName + "...");
    }
}