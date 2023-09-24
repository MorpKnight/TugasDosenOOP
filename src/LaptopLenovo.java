package src;

public class LaptopLenovo extends Device {
    private Camera camera;
    
    public String modelName;
    
    public LaptopLenovo(String modelName) {
        super("I9821312", "Ideapad Gaming I3", DeviceType.TABLET, 2019, 15000, 512, 16);
    
        this.modelName = modelName;
    }

    public void openCamera() {
        camera = new Camera();
    }
}
