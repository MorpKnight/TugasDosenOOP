package src;

public class AsusPhone extends Device {
    private Camera camera;
    
    public String modelName;
    
    public AsusPhone(String modelName, Camera camera) {
        super("M23121312", "Zenfone Max Pro", DeviceType.HANDPHONE, 2015, 4200, 64, 4);
    
        this.modelName = modelName;
        this.camera = camera;
    }

    public void turnOn() {
        System.out.println("Phone ON");
    }
    
    public void turnOff() {
        System.out.println("Phone OFF");
    }
}
