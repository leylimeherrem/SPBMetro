package core;

public class Station implements Comparable<Station>
{
    private Line line;
    private String name;

    public Station(String name, Line line) {
        this.name = name;
        setLine(line);
    }

    public Line getLine()
    {
        if (line == null) {
            throw new IllegalStateException("Line has not been set for this station");
        }
        return line;
    }

    public void setLine(Line line) {
        if (line == null) {
            throw new IllegalArgumentException("Line cannot be null");
        }
        this.line = line;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public int compareTo(Station station)
    {
        int lineComparison = line.compareTo(station.getLine());
        if(lineComparison != 0) {
            return lineComparison;
        }
        return name.compareToIgnoreCase(station.getName());
    }

    @Override
    public boolean equals(Object obj)
    {
        return compareTo((Station) obj) == 0;
    }

    @Override
    public String toString()
    {
        return name;
    }
}