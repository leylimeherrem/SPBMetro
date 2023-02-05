public class OperationMemory {
    private final String typeOM;
    private final int volume;
    private final double weight;

    public OperationMemory(String typeOM, int volume, double weight) {
        this.typeOM = typeOM;
        this.volume = volume;
        this.weight = weight;
    }

    public String getTypeOM() {
        return typeOM;
    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "Операционная память: " + "\n" + "Тип - " + getTypeOM() + "\n" + "Объем - " + getVolume() + "\n" +
                "Вес - " + getWeight() + "\n";
    }
}
