public class Cargo {

    private int weight;
    private String deliveryAddress;
    private boolean flipped;
    private String registrationNumber;
    private boolean fragile;

    public Cargo(int weight, String deliveryAddress, boolean flipped, String registrationNumber, boolean fragile) {
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.flipped = flipped;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }

    public int getWeight() {
        return weight;
    }

    public Cargo setWeight(int weight) {
        return new Cargo(weight, deliveryAddress, flipped, registrationNumber, fragile);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(weight, deliveryAddress, flipped, registrationNumber, fragile);
    }

    public boolean isFlipped() {
        return flipped;
    }

    public Cargo setFlipped(boolean flipped) {
        return new Cargo(weight, deliveryAddress, flipped, registrationNumber, fragile);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Cargo setRegistrationNumber(String registrationNumber) {
        return new Cargo(weight, deliveryAddress, flipped, registrationNumber, fragile);
    }

    public boolean isFragile() {
        return fragile;
    }

    public Cargo setFragile(boolean fragile) {
        return new Cargo(weight, deliveryAddress, flipped, registrationNumber, fragile);
    }
}