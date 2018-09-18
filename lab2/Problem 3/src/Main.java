import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Data mydata = new Data();
        while (true) {
            System.out.println("Enter number (Q to quit):");
            String s = in.next();
            if (s.equals("Q")) break;
            double val = Double.parseDouble(s);
            mydata.add(val);
        }
        System.out.println(mydata.getAverage());
        System.out.println(mydata.getMax());
    }
}