package searching;

public class Sqrt_x {

    public int mySqrt(int x) {

        int beg = 1, end = x;
        int ans = 0;

        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            int sq = mid * mid;

            if (sq == x)
                return mid;
            else if (sq > x)
                end = mid - 1;
            else {
                ans = mid;
                beg = mid + 1;
            }
        }

        return ans;

    }
/*
    public int mySqrt(int x) {
        if (x < 2) return x;

        long num;
        int pivot, left = 2, right = x / 2;

*//*
x =18
left =2
right =4
pivot =
num= 1


*//*
        while (left <= right) {
            pivot = left + (right - left) / 2;
            num = (long)pivot * pivot;
            if (num > x) right = pivot - 1;
            else if (num < x) left = pivot + 1;
            else return pivot;
        }

        return right;
    }

    */
}

