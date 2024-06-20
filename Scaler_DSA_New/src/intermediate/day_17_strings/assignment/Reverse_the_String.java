package intermediate.day_17_strings.assignment;

public class Reverse_the_String {

    private String reverse(String s)
    {
        StringBuilder sb = new StringBuilder(s);
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
// "the sky is blue"
    public static String solve(String A) {

        int start = -1,end = -1;
        StringBuilder sb = new StringBuilder();

        for (int i = A.length() - 1;i>=0;i--)
        {
            if(A.charAt(i) != ' ')
            {
                if( end == -1)
                    start = end = i;
                else
                    start = i;
            }
            else if( end != -1 && start != -1)
            {
                if(sb.length() > 0)
                    sb.append(" ");
                sb.append(A,start,end+1);
                start = end = -1;
            }

        }
        if( end != -1 && start != -1)
        {
            if(sb.length() > 0)
                sb.append(" ");
            sb.append(A,start,end+1);

        }
        return sb.toString();

    }

    public static void main(String[] args) {

        System.out.println(solve("the sky d is blue"));
        System.out.println(solve("  b"));
        System.out.println(solve("  b  "));

    }
}
