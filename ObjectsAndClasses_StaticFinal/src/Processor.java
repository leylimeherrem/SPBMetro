public class Processor {
    public double frequency;
    public int amountCore;
    public String brand;
    public double weight;

    public Processor(double frequency, int amountCore, String brand, double weight) {
        this.frequency = frequency;
        this.amountCore = amountCore;
        this.brand = brand;
        this.weight = weight;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getAmountCore() {
        return amountCore;
    }

    public void setAmountCore(int amountCore) {
        this.amountCore = amountCore;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
