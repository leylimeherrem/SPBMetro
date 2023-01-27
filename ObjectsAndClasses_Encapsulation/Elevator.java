public class Elevator {
    public int currentFloor = 1;
    public int minFloor = -3;
    public int maxFloor = 26;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor  - 1 : currentFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void move(int floor) {
        if (floor > maxFloor || floor < minFloor) {
            System.out.println("Такого этажа не существует");
        } else if (floor == currentFloor) {
            System.out.println("Введен текущий этаж");
        } else if (floor < currentFloor) {
            while (true) {
                moveDown();
                if (currentFloor != 0) {
                    System.out.println(currentFloor + " этаж");
                }
                if (floor == currentFloor){
                    break;
                }
            }
        } else if (floor > currentFloor) {
            while (true) {
                moveUp();
                if (currentFloor != 0) {
                    System.out.println(currentFloor + " этаж");
                }
                if (currentFloor == floor){
                    break;
                }
            }

        }
    }
}