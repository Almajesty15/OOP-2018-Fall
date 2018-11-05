public class Sequence {
    private String str;

    public Sequence(String str) { this.str = str; }

    public String getStr() { return str; }

    public void setStr(String s) { str = s; }

    public boolean isPalindrome()
    {
        boolean res = true;
        int len = this.str.length();
        for (int i = 0; i < len / 2; i++)
        {
            if (this.str.charAt(i) != this.str.charAt(len - 1 - i))
            {
                res = false;
                break;
            }
        }
        return res;
    }

    public boolean isSubString(Sequence s)
    {
        int tlen = this.str.length(), len = s.str.length();
        if (len > tlen) return false;
        boolean res = false;
        for (int i = 0; i <= tlen - len; i++)
        {
            if (this.str.substring(i, i + len).equals(s.str)) {
                res = true;
                break;
            }
        }
        return res;
    }
}
