import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.println("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
        Dimension dimension = new Dimension(3.0, 4.50, 10.20);
        Cargo cargo = new Cargo(15, "Буйнакского", true, "123A", false, dimension);
        this.getCargo(cargo);
    }

    public void getCargo(Cargo cargo) {
        Cargo copy = new Cargo(cargo.getWeight(), cargo.getDeliveryAdress(), cargo.sFlipped(),
                cargo.getRegistrationNumber(), cargo.isFragile(), cargo.getDimentions());
    }
}