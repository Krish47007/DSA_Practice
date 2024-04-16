package string;

public class Count_Occurrences {

    public static int solve(String A) {

        if (A.equals("bob"))
            return 1;
        char[] str = A.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length - 2; i++) {
            if (str[i] == 'b' && str[i + 1] == 'o' && str[i + 2] == 'b') {
                count++;
                /*i+=2;*/
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(solve("abobc"));
        System.out.println(solve("bobob"));
        System.out.println(solve("bob"));

    }
}
