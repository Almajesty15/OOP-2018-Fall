import java.util.ArrayList;

public class Manager extends Employee {
    double bonus;
    ArrayList<Employee> team = new ArrayList<>();

    public Manager(String name, int year, String insNumber, double bonus){
        super(name, year, insNumber);
        this.bonus = bonus;
    }

    public void addToTeam(Employee e){
        team.add(e);
    }

    public String toString(){
        String res = "Team list:\n";
        for (Employee e: team) { res += e.getName() + "\n"; }
        return res;
    }

    public boolean equals(Object object){
        if (object == this) return true;
        if (!(object instanceof Manager)) return false;

        Manager m = (Manager) object;
        return m.equals(name);
    }
}
