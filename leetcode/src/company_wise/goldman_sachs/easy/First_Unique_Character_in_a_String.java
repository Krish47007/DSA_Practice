package company_wise.goldman_sachs.easy;

import java.util.HashMap;
import java.util.Map;

public class First_Unique_Character_in_a_String {

    /*public static int firstUniqChar(String s) {

        Map<Character,Integer> freqMap = new HashMap<>();

        for (int i = 0;i<s.length();i++)
        {
            freqMap.put(s.charAt(i),freqMap.getOrDefault(s.charAt(i),0) + 1);
        }

        for (int i = 0; i < s.length();i++)
        {
            if (freqMap.get(s.charAt(i)) == 1)
                return i;
        }

        return -1;
    }*/

    public static int firstUniqChar(String s) {

        int index = -1;
        int[] ascii = new int[123];

        for (char ch : s.toCharArray())
            ascii[ch]++;

        for (int i = 0;i<s.length();i++)
        {
            if(ascii[s.charAt(i)] == 1)
            {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
        System.out.println(firstUniqChar("leetcode"));
    }
}
