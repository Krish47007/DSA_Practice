package bits;

public class Help_From_Sam {

    //The number of times we would require help from sam is the number of bits that are set in A. Check hint
    public int solve(int A) {

        int helpCount = 0;

        while (A > 0) {
            if ((A & 1) == 1)
                helpCount++;
            A >>= 1;
        }
        return helpCount;
    }

    public static void main(String[] args) {

        var obj = new Help_From_Sam();
        System.out.println(obj.solve(5));
        System.out.println(obj.solve(3));
        System.out.println(obj.solve(2));
        System.out.println(obj.solve(6));
    }
}
