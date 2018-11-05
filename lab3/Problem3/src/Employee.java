public class Employee extends Person{
    double salary = 0;
    int year = 2018;
    String insNumber;

    public Employee(String name, int year, String insNumber){
        super(name);
        this.year = year;
        this.insNumber = insNumber;
    }

    public String getName() { return super.getName(); }

    public String toString() { return "This employee is working since " + year + "\n"; }

    public boolean equals(Object object){
        if (object == this) return true;
        if (!(object instanceof Employee)) return false;

        Employee e = (Employee) object;
        return e.equals(insNumber);
    }
}
