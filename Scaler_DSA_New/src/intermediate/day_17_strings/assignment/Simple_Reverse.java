package intermediate.day_17_strings.assignment;

public class Simple_Reverse {

    public String solve(String A) {

        StringBuilder sb = new StringBuilder(A);
        int beg = 0,end = sb.length() - 1;

        while (beg < end)
        {
            char ch = sb.charAt(beg);
            sb.setCharAt(beg,sb.charAt(end));
            sb.setCharAt(end,ch);
            beg++;
            end--;
        }
        return sb.toString();
    }
}
