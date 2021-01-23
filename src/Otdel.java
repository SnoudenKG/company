public class Otdel {
    private String name;
    private String manager;
    private Departament departament;

    public Otdel(String name, String manager, Departament departament) {
        this.name = name;
        this.manager = manager;
        this.departament = departament;
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

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }
}
