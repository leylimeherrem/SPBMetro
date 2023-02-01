public class OperationMemory {
    public String typeOM;
    public int volume;
    public double weight;

    public OperationMemory(String typeOM, int volume, double weight) {
        this.typeOM = typeOM;
        this.volume = volume;
        this.weight = weight;
    }

    public String getTypeOM() {
        return typeOM;
    }

    public void setTypeOM(String typeOM) {
        this.typeOM = typeOM;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
