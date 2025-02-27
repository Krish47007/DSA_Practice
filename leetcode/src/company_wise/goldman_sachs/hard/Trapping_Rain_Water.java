package company_wise.goldman_sachs.hard;

public class Trapping_Rain_Water {

    private static int[] buildPrefix(int[] arr)
    {
        int leftMax = -1;
        int[] pf = new int[arr.length];
        pf[0] = leftMax;
        leftMax = arr[0];

        for (int i = 1;i<arr.length;i++)
        {
            pf[i] = leftMax;
            leftMax = Math.max(leftMax,arr[i]);
        }
        return pf;
    }

    private static int[] buildSuffix(int[] arr)
    {
        int rightMax = -1;
        int[] sf = new int[arr.length];
        sf[arr.length - 1] = rightMax;
        rightMax = arr[arr.length - 1];

        for (int i = arr.length - 2;i >= 0;i--)
        {
            sf[i] = rightMax;
            rightMax = Math.max(rightMax,arr[i]);
        }
        return sf;
    }

    public static int trap(int[] height) {

        int[] leftMax = buildPrefix(height);
        int[] rightMax = buildSuffix(height);

        int waterTrapped = 0;

        for (int i = 0;i<height.length;i++)
        {
            int lh = leftMax[i];
            int rh = rightMax[i];

            if (lh > 0 && rh > 0 && Math.min(lh,rh) - height[i] > 0)
                waterTrapped += Math.min(lh,rh) - height[i];
        }
        return waterTrapped;
    }

    public static void main(String[] args) {

        System.out.println(trap(new int[]{3,1,2,4,0,1,3,2}));
    }
}
