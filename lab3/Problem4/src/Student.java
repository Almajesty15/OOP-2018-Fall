public class Student extends Person {

    public Student(String name) { super(name); }

    public String getName() {
        System.out.println("Student name: " + name);
        return name;
    }
}
