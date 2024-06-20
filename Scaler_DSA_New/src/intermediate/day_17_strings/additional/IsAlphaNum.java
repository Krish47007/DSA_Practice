package intermediate.day_17_strings.additional;

public class IsAlphaNum {

    private boolean isAlphaNumChar(char ch)
    {
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))
            return true;
        return false;
    }
    public int solve(char[] A) {

        for (char ch :  A)
        {
            if(!isAlphaNumChar(ch))
                return 0;
        }
        return 1;
    }
}
