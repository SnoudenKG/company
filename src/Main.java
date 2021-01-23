public class Main {
    public static void main(String[] args) {
        Company company =new Company("megacom", "Bishkek");
        Direction direction = new Direction("alfa telecom", "Janybek", company);
        Departament departament = new Departament("It","Dolon",direction);
        Otdel otdel = new Otdel("Java", "dolon", departament);
        Position position= new Position("Junior", 10000, 15000, otdel);
        Staff staff = new Staff("Aidar", 12000, position, otdel);

        System.out.println("Name-"+staff.getName());
        System.out.println(("salary -"+ staff.getSalary()));
        System.out.println("position -" +staff.getPosition().getName());
        System.out.println("Otdel-" +staff.getOtdel().getName());
        System.out.println("Departament-"+staff.getOtdel().getDepartament().getName());
        System.out.println("Direction -" +staff.getOtdel().getDepartament().getDirection().getName());
        System.out.println("Company-"+staff.getOtdel().getDepartament().getDirection().getCompany().getName());
    }
}
