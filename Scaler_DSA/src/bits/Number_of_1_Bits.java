package bits;

public class Number_of_1_Bits {


    public int numSetBits(int A) {

        int count = 0;
        while (A > 0) {
            if ((A & 1) == 1)
                count++;

            A >>= 1;
        }
        return count;
    }
}
