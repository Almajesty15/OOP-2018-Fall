public class Tester {
    public static void main(String[] args) {
        Sequence sq1 = new Sequence("abacaba");
        Sequence sq2 = new Sequence("ba");

        if (sq1.isPalindrome()) {
            System.out.println("Sq1 is a palindrome");
        } else {
            System.out.println("Sq1 is not a palindrome");
        }

        if (sq2.isPalindrome()) {
            System.out.println("Sq2 is a palindrome");
        } else {
            System.out.println("Sq2 is not a palindrome");
        }

        if (sq1.isSubString(sq2)) {
            System.out.println("Sq2 is a substring of Sq1");
        } else {
            System.out.println("Sq2 is not a substring of Sq1");
        }
    }
}
