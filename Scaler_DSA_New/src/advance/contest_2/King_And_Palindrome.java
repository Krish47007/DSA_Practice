package advance.contest_2;

import java.util.HashMap;
import java.util.Map;

public class King_And_Palindrome {

    /*
    For each character count:
    If the count is even, the entire count can be used as is (since even counts of characters can be symmetrically placed around the center of a palindrome).
    If the count is odd, we add the largest even number less than the count to ans (i.e., count - 1). The reason is that for a character with an odd count, we can place an even number of that character in a symmetric way around the center, leaving out one character which could potentially be placed in the center of the palindrome.

    Lets say A = "banana"
        a -> 3
        b -> 1
        n -> 2

        so count of n can be placed as it is and even half of a that is 3-1 = 2 can be placed as well. Since at least one odd
        occurenece is there we increment ans by 1 as that odd element will be placed at center.
        aann
        an a na ==> Palindrome
     */

    public static int solve(String A) {

        Map<Character,Integer> map = new HashMap<>();
        for (char ch : A.toCharArray())
            map.put(ch,map.getOrDefault(ch,0) + 1);

        int ans = 0;
        boolean oddOccurrence = false;
        for (int count : map.values())
        {
            if(count % 2 == 0)
                ans += count;
            else
            {
                //take only even part ,i.e, if count is 7 take 6
                ans = ans + count - 1;
                oddOccurrence = true;
            }
        }

        if(oddOccurrence)
            ans += 1; //can be placed at middle

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(solve("dccbcdaac"));
    }
}
