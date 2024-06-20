package intermediate.day_17_strings.additional;

public class Count_Occurrences {

    public static int solve(String A) {

        int bc = 0;
        for (int i = 0;i < A.length()-2;i++)
        {
            if(A.charAt(i) == 'b' && A.charAt(i+1) == 'o' && A.charAt(i+2) == 'b')
                bc++;
        }
        return bc;
    }

    public static void main(String[] args) {

        System.out.println(solve("bobabtbobl"));
    }
}
