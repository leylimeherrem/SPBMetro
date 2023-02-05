public class Main {
    public static void main(String[] args) {


        Processor processor1 = new Processor(3.6,5, "Intel", 10.5);
        OperationMemory operationMemory1 = new OperationMemory("Ram", 250, 100);
        StorageMemory storageMemory1 = new StorageMemory(DiskType.SSD, 200, 1000);
        Screen screen1 = new Screen(ScreenType.IPS, 150, 500);
        Keyboard keyboard1 = new Keyboard("Мультимедийная", false, 100);

        Computer computer1 = new Computer("China", "Intel", processor1, operationMemory1, storageMemory1,screen1,keyboard1);


        System.out.println(computer1.toString());

    }
}