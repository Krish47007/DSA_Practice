package advance.day_24_bit_manipulation_2.assignment;

public class Single_Number_3 {

    public static int[] solve(int[] A) {

        int[] ans = new int[2];

        int xorResult = 0;
        //elements appearing twice will yield 0
        //single elements wil result non zero value
        for (int x : A)
            xorResult ^= x;

        //check which bit is set in xorResult
        int b = -1;
        for (int i = 0;i<32;i++)
        {
            if((xorResult & (1 << i)) > 0)
            {
                b = i;
                break;
            }
        }
        //Now in single numbers one of them have 1 at bth bit and other is having 0
        //segregate the nums where bth bit is 0 and 1
        //which will create two groups - a single num with bth bit as 0 in 1 set and a single num with bth bit as 1 in another set.
        //remaining nums in both the sets are appearing twice.
        int x = 0, y = 0;

        for (int num : A)
        {
            if((num & (1 << b)) > 0)
                x^=num;
            else
                y ^= num;
        }

        //store in ascending order
        ans[0] = Math.min(x, y);
        ans[1] = Math.max(x,y);
        return ans;
    }

    public static void main(String[] args) {

        for (int x : solve(new int[]{1, 2, 3, 1, 2, 4}))
            System.out.print(x+ " ");
    }
}
