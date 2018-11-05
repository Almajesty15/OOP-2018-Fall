public class Person {
    String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() { return name; }

    public String toString() { return "This is " + name; }

    public boolean equals(Object object){
        if (object == this) return true;
        if (!(object instanceof Person)) return false;

        Person p = (Person) object;
        return p.equals(name);
    }
}
