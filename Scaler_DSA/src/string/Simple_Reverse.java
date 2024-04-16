package string;

public class Simple_Reverse {

    public String solve(String A) {

        char[] str = A.toCharArray();
        int beg = 0, end = str.length - 1;

        while (beg < end) {
            char t = str[beg];
            str[beg] = str[end];
            str[end] = t;
            beg++;
            end--;
        }
        return new String(str);
    }
}
