package arrays.intermediate;

import java.util.List;

public class Amazing_Subarrays {

    private boolean isVowel(char ch)
    {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch =='A'
                || ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U')
            return true;
        return false;
    }

    public int solve(String s) {

        int mod = 10003;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            /*Once we get a vowel after that all the substrings starting from that index are valid including the vowel itself*/
            if (isVowel(s.charAt(i)))
                count = (count + s.length() - i) % mod;
        }

        return count;
    }
}
