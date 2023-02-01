public class Screen {
    public int diagonal;
    public boolean IPS;
    public boolean TN;
    public boolean VA;
    public double weight;

    public Screen(int diagonal, boolean IPS, boolean TN, boolean VA, double weight) {
        this.diagonal = diagonal;
        this.IPS = IPS;
        this.TN = TN;
        this.VA = VA;
        this.weight = weight;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public boolean isIPS() {
        return IPS;
    }

    public void setIPS(boolean IPS) {
        this.IPS = IPS;
    }

    public boolean isTN() {
        return TN;
    }

    public void setTN(boolean TN) {
        this.TN = TN;
    }

    public boolean isVA() {
        return VA;
    }

    public void setVA(boolean VA) {
        this.VA = VA;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
