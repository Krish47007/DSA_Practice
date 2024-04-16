package arrays.intermediate.day_11_carry_forward.classroom;

public class LeadersInArray {

    public int getLeadersCount(int[] arr)
    {
        if(arr.length == 0)
            return 0;
        int lc = 1; //last element is always a leader
        int n = arr.length;

        int maxRight = arr[n-1];

        for (int i = n-2;i>=0;i--)
        {
            if(arr[i] > maxRight)
            {
                lc++;
                maxRight = arr[i];
            }
        }
        return lc;
    }

    public static void main(String[] args) {

        var obj = new LeadersInArray();
        System.out.println(obj.getLeadersCount(new int[]{5,6,8,0,1,2}));
    }
}
