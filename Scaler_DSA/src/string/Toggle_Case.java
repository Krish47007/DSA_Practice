package string;

public class Toggle_Case {

    public String solve(String A) {

        char[] str = A.toCharArray();
        for (int i = 0; i < str.length; i++) {
            char ch = str[i];
            if (ch >= 'A' && ch <= 'Z') {
                str[i] = (char) (ch + 32);
            }
            if (ch >= 'a' && ch <= 'z') {
                str[i] = (char) (ch - 32);
            }

        }
        return new String(str);
    }
}
