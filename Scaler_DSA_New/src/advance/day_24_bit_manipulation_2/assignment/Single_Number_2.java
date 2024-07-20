package advance.day_24_bit_manipulation_2.assignment;

public class Single_Number_2 {

    public static int singleNumber(final int[] A) {

        int ans = 0;
        //Since in java integer is 32 bits
        for (int b = 0; b < 32; b++)
        {
            int setBitCount = 0;

            //check bth bit in all array elements
            for (int x : A)
            {
                if( (x & (1 << b)) > 0)
                    setBitCount++;
            }

            //Set bth bit in ans if it has 3x+1 1s for all array elements
            if(setBitCount % 3 == 1)
                ans = ans | (1 << b);
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(singleNumber(new int[]{1, 2, 4, 3, 3, 2, 2, 3, 1, 1}));
    }
}
