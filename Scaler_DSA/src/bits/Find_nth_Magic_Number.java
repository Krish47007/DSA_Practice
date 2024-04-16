package bits;

public class Find_nth_Magic_Number {

    public int solve(int A) {

        int ans1 = 5, ans2 = 0;

        for (int i = 2; i <= A; i++) {
            if (i % 2 != 0)
                ans1 = ans1 * 5;
            else
                ans2 = ans1 + 5;
        }

        return A % 2 != 0 ? ans1 : ans2;
    }

    public static void main(String[] args) {

        var obj = new Find_nth_Magic_Number();
        System.out.println(obj.solve(2));
    }
}
