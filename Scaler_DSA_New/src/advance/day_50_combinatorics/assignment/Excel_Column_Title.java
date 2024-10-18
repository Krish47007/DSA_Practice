package advance.day_50_combinatorics.assignment;

import java.util.HashMap;
import java.util.Map;

public class Excel_Column_Title {

    private static Map<Integer,Character> buildMap()
    {
        Map<Integer,Character> charMap = new HashMap<>();
        for (int i = 0;i<26;i++)
        {
            char ch = (char) ('A' + i);
            charMap.put(i+1,ch);
        }

        return charMap;
    }
    public static String convertToTitle(int n) {

        String ans = "";
        Map<Integer,Character> charMap = buildMap();
        while ( n != 0)
        {
            int rem = n % 26;
            if (rem == 0)
            {
                ans = 'Z' + ans;
                n--;
            }
            else
            {
                ans = charMap.get(rem) + ans;
            }
            n = n/26;
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(convertToTitle(30));
        System.out.println(convertToTitle(50));
        System.out.println(convertToTitle(52));
    }
}
