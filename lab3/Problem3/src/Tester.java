public class Tester {
    public static void main(String[] args){
        Manager boss = new Manager("Unai", 2004, "634631", 2000);

        Employee emp1 = new Employee("Mesut", 2013, "543314");
        Employee emp2 = new Employee("Lucas", 2018, "315783");

        Person p = new Person("Jack");

        boss.addToTeam(emp1);
        boss.addToTeam(emp2);

        if (boss.equals("Unai")) System.out.println(boss.toString());

        if (emp2.equals("315783")) System.out.println(emp1.toString());

        if (p.equals("Jack")) System.out.println(p.toString());
    }
}
