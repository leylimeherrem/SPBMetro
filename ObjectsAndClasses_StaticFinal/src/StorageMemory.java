public class StorageMemory {

private final DiskType type;
private final double storageVolume;
private final double weight;

    public StorageMemory(DiskType type, double storageVolume, double weight) {
        this.type = type;
        this.storageVolume = storageVolume;
        this.weight = weight;
    }

    public DiskType getType() {
        return type;
    }

    public double getStorageVolume() {
        return storageVolume;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "\n" + "Накопитель информации: " + "\n" + "Тип - " + getType() + "\n" + "Объём Памяти - " + getStorageVolume() +
                "\n" + "Вес - " + getWeight() + "\n";
    }
}
