public class Departament {

    private String name;
    private String manager;
    private Direction direction;

    public Departament(String name, String manager, Direction direction) {
        this.name = name;
        this.manager = manager;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
