public class Computer {
    public String vendor;
    public String name;
    public Processor processor;
    public OperationMemory operationMemory;
    public StorageMemory storageMemory;
    public Screen screen;
    public Keyboard keyboard;
    public double totalWeight;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public Computer(String vendor, String name, double totalWeight) {
        this.vendor = vendor;
        this.name = name;
        this.totalWeight = totalWeight;
    }

    public Computer(String vendor, String name, Processor processor, OperationMemory operationMemory,
                    StorageMemory storageMemory, Screen screen, Keyboard keyboard, double totalWeight) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.operationMemory = operationMemory;
        this.storageMemory = storageMemory;
        this.screen = screen;
        this.keyboard = keyboard;
        this.totalWeight = totalWeight;
    }

    public String getVendor() { return vendor;}

    public void setVendor(String vendor) { this.vendor = vendor; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name;}
    public double getTotalWeight() {
        return processor.getWeight() + storageMemory.getWeight() + operationMemory.getWeight() +
                screen.getWeight() + keyboard.getWeight();
    }

    public Processor getProcessor() { return processor; }
    public void setProcessor(Processor processor) { this.processor = processor; }
    public OperationMemory getOperationMemory() { return operationMemory; }
    public void setOperationMemory(OperationMemory operationMemory) { this.operationMemory = operationMemory; }
    public StorageMemory getStorageMemory() { return storageMemory; }
    public void setStorageMemory(StorageMemory storageMemory) { this.storageMemory = storageMemory; }
    public Screen getScreen() { return screen; }
    public void setScreen(Screen screen) { this.screen = screen; }
    public Keyboard getKeyboard() { return keyboard; }
    public void setKeyboard(Keyboard keyboard) { this.keyboard = keyboard; }
    public void setTotalWeight(double totalWeight) { this.totalWeight = totalWeight;}

        public String toString() {
        return "Данные о компьютере: " + "\n" + "\n" +
                "Страна Производитель: " + getName() + "\n" +
                "Поставщик: " + getVendor() + "\n" + processor.toString() + operationMemory.toString() + storageMemory.toString() +
                screen.toString() + keyboard.toString() + "Общий вес компьютера: " + getTotalWeight() + "грамм" + "\n";
    }
}
