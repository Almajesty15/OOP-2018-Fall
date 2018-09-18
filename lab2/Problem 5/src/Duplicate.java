public class Duplicate {
    static int[] dupllicate(int[] arr) {
        int[] newarr = new int[arr.length * 2];
        for(int i = 0; i < arr.length; ++i) {
            newarr[i * 2] = arr[i];
            newarr[i * 2 + 1] = arr[i];
        }
        return newarr;
    }
}