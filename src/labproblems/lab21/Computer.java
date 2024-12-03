package labproblems.lab21;

// Original class to refactor into builder pattern
public class Computer {
    private String processor;
    private int ram;
    private int storage;
    private boolean graphicsCard;
    private boolean bluetooth;
    
    // Constructor with all parameters
    public Computer(String processor, int ram, int storage, boolean graphicsCard, boolean bluetooth) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
        this.bluetooth = bluetooth;
    }

    // Getters
    public String getProcessor() { return processor; }
    public int getRam() { return ram; }
    public int getStorage() { return storage; }
    public boolean hasGraphicsCard() { return graphicsCard; }
    public boolean hasBluetooth() { return bluetooth; }

    @Override
    public String toString() {
        return "Computer Specs:" +
                "\nProcessor: " + processor +
                "\nRAM: " + ram + "GB" +
                "\nStorage: " + storage + "GB" +
                "\nGraphics Card: " + (graphicsCard ? "Yes" : "No") +
                "\nBluetooth: " + (bluetooth ? "Yes" : "No");
    }
}