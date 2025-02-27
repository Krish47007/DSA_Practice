package _1_arrays_1_and_hashing.classroom;

public class Plus_One {

    public static int[] plusOne(int[] digits) {

        int n = digits.length;

        for (int i = n-1;i>=0;i--)
        {
            if (digits[i] == 9)
                digits[i] = 0;
            else
            {
                digits[i]++;
                return digits;
            }
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }

    public static void main(String[] args) {

        for (int x : plusOne(new int[]{9,9,1}))
            System.out.print(x);
    }
}
