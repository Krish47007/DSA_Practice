package string;

public class Isalnum {

    boolean isAlphaNumeric(char ch) {
        if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')))
            return false;
        return true;
    }

    public int solve(char[] A) {

        for (char ch : A) {
            if (!isAlphaNumeric(ch))
                return 0;
        }
        return 1;
    }
}
