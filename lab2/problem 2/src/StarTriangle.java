public class StarTriangle {

    private int size;
    private String Triangle;

    StarTriangle(int _size) {
        size = _size;
        Triangle = "";
        for (int i = 1; i <= _size; ++i) {
            for(int j = 1; j <= i; ++j) {
                Triangle += "[*]";
            }
            Triangle += "\n";
        }
    }

    public String toString() {
        return Triangle;
    }

}