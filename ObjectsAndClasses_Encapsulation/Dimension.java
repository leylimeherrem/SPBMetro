public class Dimension {
    private final double width;
    private final double height;
    private final double length;

    public Dimension(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public Dimension setWidth(double width) {
        return new Dimension(width, height, length);
    }

    public Dimension setHeight(double height) {
        return new Dimension(width, height, length);
    }

    public Dimension setLength(double length) {
        return new Dimension(width, height, length);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double volume() {
        return width * height * length;
    }
}