package bits;

public class Check_bit {

    public int solve(int A, int B) {

        if ((A & (1 << B)) == (1 << B))
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {

        var obj = new Check_bit();
        System.out.println(obj.solve(4, 1));
        System.out.println(obj.solve(5, 2));
    }
}
