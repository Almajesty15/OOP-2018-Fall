public class Data {
    private double max, sum;
    private int size;
    Data() {
        size = 0;
        max = 0;
        sum = 0;
    }

    void add(double val) {
        if (size == 0) {
            max = val;
        }else {
            max = Math.max(val, max);
        }
        sum += val;
        size++;
    }

    double getAverage() {
        if (size == 0) return 0;
        return sum / size;
    }

    double getMax() {
        return max;
    }
}