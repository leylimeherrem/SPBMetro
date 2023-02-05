public class Processor {
    private final double frequency;
    private final int amountCore;
    private final String brand;
    private final double weight;

    public double getFrequency() {
        return frequency;
    }

    public int getAmountCore() {
        return amountCore;
    }

    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }

    public Processor(double frequency, int amountCore, String brand, double weight) {
        this.frequency = frequency;
        this.amountCore = amountCore;
        this.brand = brand;
        this.weight = weight;

    }

    public String toString() {
        return "Процессор: " + "\n" + "Частота - " + getFrequency() + "\n" + "количество ядер - " + getAmountCore() + "\n" +
                "производитель - " + getBrand() + "\n" + "Вес - " + getWeight() + "\n" + "\n";
    }

}
