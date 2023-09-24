package src;

import java.io.*;

public class Device
{
    private String imei;
    private DeviceType type;
    
    private int releaseYear;
    private int romSize, ramSize;
    private double price;
    private String name;
    
    public Device(String imei, String name, DeviceType type, int releaseYear, double price, int romSize, int ramSize) {
        this.imei = imei;
        this.name = name;
        this.type = type;
        this.releaseYear = releaseYear;
        this.price = price;
        this.romSize = romSize;
        this.ramSize = ramSize;
    }
    
    // .... //
    
    public void turnOn() {
        System.out.println("Turning this device ON...");
    }
    
    public void turnOff() {
        System.out.println("Turning this device OFF...");
    }
    
    public DeviceType getDeviceType() {
        return this.type;
    }
    
    public int getReleaseYear() {
        return this.releaseYear;
    }
    
    public int getRomSize() {
        return this.romSize;
    }
    
    public int getRamSize() {
        return this.ramSize;
    }
    
    public double price() {
        return this.price;
    }
    
    public String name() {
        return this.name;
    }
}
