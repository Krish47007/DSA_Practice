package intermediate.day_17_strings.assignment;

public class Toggle_Case {

    public String solve(String A) {

        StringBuilder sb = new StringBuilder(A);

        for (int i = 0;i<sb.length();i++)
        {
            char ch = sb.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
                sb.setCharAt(i,(char)(ch+32) );
            else if( ch >= 'a' && ch <= 'z')
                sb.setCharAt(i,(char)(ch-32) );
        }
        return sb.toString();
    }


}
