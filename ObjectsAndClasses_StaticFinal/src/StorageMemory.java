public class StorageMemory {
public double HDD;
public double SDD;
public double storageVolume;
public double weight;

    public StorageMemory(double HDD, double SDD, double storageVolume, double weight) {
        this.HDD = HDD;
        this.SDD = SDD;
        this.storageVolume = storageVolume;
        this.weight = weight;
    }

    public double getHDD() {
        return HDD;
    }

    public void setHDD(double HDD) {
        this.HDD = HDD;
    }

    public double getSDD() {
        return SDD;
    }

    public void setSDD(double SDD) {
        this.SDD = SDD;
    }

    public double getStorageVolume() {
        return storageVolume;
    }

    public void setStorageVolume(double storageVolume) {
        this.storageVolume = storageVolume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
