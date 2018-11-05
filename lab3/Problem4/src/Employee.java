public class Employee extends Person {

    public Employee(String name) { super(name); }

    public String getName() {
        System.out.println("Employee name: " + name);
        return name;
    }
}
