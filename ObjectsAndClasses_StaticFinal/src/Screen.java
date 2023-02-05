public class Screen {

    private final ScreenType screenType;
    private final int diagonal;
    private final double weight;

    public Screen(ScreenType screenType, int diagonal, double weight) {
        this.screenType = screenType;
        this.diagonal = diagonal;
        this.weight = weight;
    }

    public ScreenType getScreenType() {
        return screenType;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public double getWeight() {
        return weight;
    }
    public String toString() {
        return "\n" + "Экран: " + "\n" + "Диагональ - " + getDiagonal() + "\n" + "Тип - " + getScreenType() + "\n" +
                "Вес - " + getWeight() + "\n" + "\n";
    }
}
