public class Direction {
    private String name;
    private String manager;
    private Company company;

    public Direction(String name, String manager, Company company) {
        this.name = name;
        this.manager = manager;
        this.company = company;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
