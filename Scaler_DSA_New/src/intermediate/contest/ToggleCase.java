package intermediate.contest;

public class ToggleCase {

    public static String solve(String A) {

        StringBuilder sb = new StringBuilder(A);
        for (int i = 0;i<sb.length();i++)
        {
            char ch = sb.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
                sb.setCharAt(i,(char) (ch+32));
            else
                sb.setCharAt(i,(char) (ch-32));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solve("Hello"));

        int[] A = new int[5];
        int[] pf = new int[5];

        int i = 2;
        pf[i] = pf[i-1] + ((A[i] > 0) ? 1 : 0);

        pf[0] = (A[0] > 0) ? 1 : 0;
    }
}
