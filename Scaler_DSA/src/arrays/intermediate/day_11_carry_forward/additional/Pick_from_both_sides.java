package arrays.intermediate.day_11_carry_forward.additional;

public class Pick_from_both_sides {

    public int solve(int[] arr, int B) {


        int n = arr.length;


        int[] pf = new int[n];
        int[] sf = new int[n];

        pf[0] = arr[0];
        sf[n - 1] = arr[n - 1];

        for (int i = 1, j = n - 2; i< n && j >= 0; i++,j--) {
            pf[i] = pf[i - 1] + arr[i];
            sf[j] = sf[j+1] + arr[j];
        }

        /*
         * Remaining combinations: for B = 3
         * 0,3
         * 1,2
         * 2,1
         * 3,0*/
        //take max b/w all B elements from left and from right
        int sum = Math.max(pf[B-1],sf[n-B]);

        //Remaining combinations
        for (int i = 1;i < B;i++)
        {
            sum = Math.max(sum,(pf[i-1] + sf[n - (B-i)]));

        }
        return sum;
    }
}
