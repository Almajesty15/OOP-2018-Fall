public class Main {

    public static void main(String[] args) {
        Time t = new Time(23, 4, 6);
        System.out.println(t.toStandard());
        System.out.println(t.toUniversal());
        t.add(new Time(4, 1, 30));
        System.out.print(t.toUniversal());
    }
}
