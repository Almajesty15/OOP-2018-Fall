public class Main {


    static String[] numwords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static String[] ty = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    static String[] part = {"hundred", "thousand"};
    static String[] ten = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
            "nineteen"};

    public static void main(String[] args) {
        for(int i = 1000; i <= 90000; i += 533) {
            System.out.println(i + " " + inWords(i));
        }
    }

    public static String inWords(int number) {
        String ans = "";
        int thousand = number / 1000;
        number %= 1000;
        if (thousand > 0) {
            ans += lessThanHundred(thousand) + " " + "thousand" + " ";
        }
        int hundred = number / 100;
        number %= 100;
        if (hundred > 0) {
            ans += lessThanHundred(hundred) + " " + "hundred" + " ";
        }
        if (number > 0) {
            ans += lessThanHundred(number);
        }
        return ans;
    }

    public static String lessThanHundred(int x) {
        if (x <= 9) return numwords[x];
        if (x >= 11 && x <= 19) return ten[x % 10 - 1];
        String cur = ty[x / 10 - 1] + " ";
        if (x % 10 > 0) cur += numwords[x % 10];
        return cur;
    }
}