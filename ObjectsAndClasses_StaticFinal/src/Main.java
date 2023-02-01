public class Main {
    public static void main(String[] args) {

        Processor processor1 = new Processor(3.6,5, "Intel", 10.5);
        OperationMemory operationMemory1 = new OperationMemory("Ram", 250, 100);
        StorageMemory storageMemory1 = new StorageMemory(300, 200, 1000, 200);
        Screen screen1 = new Screen(100, true, false, false, 300);
        Keyboard keyboard1 = new Keyboard("Мультимедийная", false, 100);

        Computer computer1 = new Computer("China", "Intel");
        computer1.setProcessor(processor1);
        computer1.setOperationMemory(operationMemory1);
        computer1.setStorageMemory(storageMemory1);
        computer1.setScreen(screen1);
        computer1.setKeyboard(keyboard1);

        System.out.println(computer1.toString());

    }
}