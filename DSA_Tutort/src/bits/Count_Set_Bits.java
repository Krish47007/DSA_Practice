package bits;

public class Count_Set_Bits {

    public static int countSetBits(int x)
    {
        int count = 0;

        while ( x != 0)
        {
            if((x & 1) == 1) //if last digit of x is 1 then and will yield in 1
                count++;

            x >>=1; //right shifting the number.  010001
                                                //000001
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countSetBits(3));
        System.out.println(countSetBits(7));
        System.out.println(countSetBits(0));
        System.out.println(countSetBits(10));
    }
}
