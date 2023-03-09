public class Station {
    private String stationName;
    private int depth;

    public Station(String stationName, int depth) {
        this.stationName = stationName;
        this.depth = depth;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}

