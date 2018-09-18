public class Main {

    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        int[] newx = Duplicate.dupllicate(x);
        for(int i = 0; i < newx.length; ++i) {
            System.out.print(newx[i] + " ");
        }
    }

}