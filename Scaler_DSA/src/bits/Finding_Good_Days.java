package bits;

public class Finding_Good_Days {
    /*Since for each day, the food doubles up as the previous day with 1 unit on the first day, starting from i = 0,
        the number of food units Boomer was supposed to get on ith day is 2i.

        Only on the days he was well behaved did he get food. So adding the power of 2 on each day, he was well behaved,
        gives the total number of food units, i.e., A.

    Hence, the number of 1’s in the binary representation of A is the number of days he was well behaved.
    */
    public int solve(int A) {

        int dayCount = 0;

        while (A > 0) {
            if ((A & 1) == 1)
                dayCount++;
            A >>= 1;
        }
        return dayCount;
    }
}
