public class Staff {
    private String name;
    private double salary;
    private Position position;
    private Otdel otdel;

    public Staff(String name, double salary, Position position, Otdel otdel) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.otdel = otdel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Otdel getOtdel() {
        return otdel;
    }

    public void setOtdel(Otdel otdel) {
        this.otdel = otdel;
    }
}
