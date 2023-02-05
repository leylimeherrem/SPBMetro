public class Computer {
    private final String vendor;
    private final String name;
    private Processor processor;
    private OperationMemory operationMemory;
    private StorageMemory storageMemory;
    private Screen screen;
    private Keyboard keyboard;
    private double totalWeight;





    public Computer(String vendor, String name, Processor processor, OperationMemory operationMemory,
                    StorageMemory storageMemory, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.operationMemory = operationMemory;
        this.storageMemory = storageMemory;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }



    public String getName() {
        return name;
    }

    public double getTotalWeight() {
        return processor.getWeight() + storageMemory.getWeight() + operationMemory.getWeight() +
                screen.getWeight() + keyboard.getWeight();
    }

    public Processor getProcessor() {
        return processor;
    }

    public OperationMemory getOperationMemory(OperationMemory operationMemory1) {
        return operationMemory;
    }

    public StorageMemory getStorageMemory(StorageMemory storageMemory1) {
        return storageMemory;
    }

    public Screen getScreen(Screen screen1) {
        return screen;
    }

    public Keyboard getKeyboard(Keyboard keyboard1) {
        return keyboard;
    }

    public String toString() {
        return "Данные о компьютере: " + "\n" + "\n" +
                "Страна Производитель: " + getName() + "\n" +
                "Поставщик: " + getVendor() + "\n" + "\n" + processor.toString() + operationMemory.toString() + storageMemory.toString() +
                screen.toString() + keyboard.toString() + "Общий вес компьютера: " + getTotalWeight() + "грамм" + "\n";
    }
}
