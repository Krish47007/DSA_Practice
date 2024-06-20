package intermediate.day_17_strings.additional;

public class Longest_Common_Prefix {

    private String commonPrefix(String s1,String s2)
    {
      String longString = s1.length() >= s2.length() ? s1 : s2;
      String smallString = s1.length() < s2.length() ? s1 : s2;
      StringBuilder pf = new StringBuilder();
      int idx = 0;
      for (int i = 0;i<smallString.length();i++)
      {
          if(smallString.charAt(i) == longString.charAt(idx))
          {
              pf.append(smallString.charAt(i));
              idx++;
          }
          else
              break;
      }
      return pf.toString();
    }

    public String longestCommonPrefix(String[] A) {

        String[] pfForCommonPrefix = new String[A.length];
        //1st string is common prefix of itself
        pfForCommonPrefix[0] = A[0];

        for (int i = 1;i<A.length;i++) {
            String commonPf = commonPrefix(pfForCommonPrefix[i - 1], A[i]);
            if("".equals(commonPf))
                return commonPf;
            pfForCommonPrefix[i] = commonPf;
        }

        return pfForCommonPrefix[A.length-1];

    }

    public static void main(String[] args) {

        var obj = new Longest_Common_Prefix();
        System.out.println(obj.longestCommonPrefix(new String[]{
                "abd",
                "abc",
                "abcd",
                "abcde",
                "ab"
        }));
    }
}
