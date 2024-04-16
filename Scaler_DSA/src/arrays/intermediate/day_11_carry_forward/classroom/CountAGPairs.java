package arrays.intermediate.day_11_carry_forward.classroom;

public class CountAGPairs {

    public static int countAG(String str)
    {
        int gCount = 0, pairCount = 0;

        for (int i = str.length()-1; i>=0; i--)
        {
            if(str.charAt(i) == 'g')
                gCount++;
            else if(str.charAt(i) == 'a')
                pairCount += gCount;
        }
        return pairCount;
    }

    public static void main(String[] args) {

        System.out.println(countAG("adgagagfg"));
    }
}
