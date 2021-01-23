public class Position {
    private String name;
    private double min;
    private double max;
    private Otdel otdel;

    public Position(String name, double min, double max, Otdel otdel) {
        this.name = name;
        this.min = min;
        this.max = max;
        this.otdel = otdel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public Otdel getOtdel() {
        return otdel;
    }

    public void setOtdel(Otdel otdel) {
        this.otdel = otdel;
    }
}
