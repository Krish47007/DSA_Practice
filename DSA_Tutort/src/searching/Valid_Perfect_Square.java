package searching;

public class Valid_Perfect_Square {

    public static boolean isPerfectSquare(int num) {

        int beg = 0,end = num;

        while (beg <= end)
        {
            int mid = beg + (end - beg)/2;
            int sq = mid * mid;

            if(sq == num)
                return true;
            else if(sq > num)
                end = mid - 1;
            else
                beg = mid + 1;

        }
        return false;

    }

    public static void main(String[] args) {

        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(11));
    }
}
