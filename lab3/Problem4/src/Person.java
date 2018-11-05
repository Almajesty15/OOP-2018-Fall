public class Person {
    String name;

    public Person(String name) { this.name = name; }

    public String getName() {
        System.out.println("Name: " + name);
        return name;
    }
}
