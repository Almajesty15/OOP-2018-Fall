public class Tester {
    public static void main(String[] args) {
        Person st = new Student("Khabib");
        printInfo(st);
        st.getName();
    }

    public static void printInfo(Person p) { p.getName(); }


}
