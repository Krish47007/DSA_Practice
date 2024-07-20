package advance.day_32_hashing_1.assignment;

import java.util.*;

public class Common_Elements {

    /*
    * Simple solution - easy*/
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        Map<Integer,Integer> mapA = new HashMap<>();
        for (int x : A)
            mapA.put(x,mapA.getOrDefault(x,0) + 1);

        ArrayList<Integer> ans = new ArrayList<>();

        //Iterate B arraylist and check if an element from B is present in hashmap
        for (int x : B)
        {
            if(mapA.containsKey(x) && mapA.get(x) != 0)
            {
                ans.add(x);
                mapA.put(x,mapA.get(x) - 1);

            }
        }

        return ans;
    }

    // Solution is correct but uses two maps and complex checking
    /*public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        Map<Integer,Integer> mapA = new HashMap<>();
        for (int x : A)
            mapA.put(x,mapA.getOrDefault(x,0) + 1);

        Map<Integer,Integer> mapB = new HashMap<>();
        for (int x : B)
            mapB.put(x,mapB.getOrDefault(x,0) + 1);

        ArrayList<Integer> ans = new ArrayList<>();
        mapA.forEach((key,val) -> {
            if(mapB.containsKey(key))
            {
                for (int i = 1;i<=Math.min(mapB.get(key),val);i++)
                    ans.add(key);
            }
        });
        return ans;
    }
*/
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,2,1));
        ArrayList<Integer> B = new ArrayList<>(List.of(2,3,1,2));

        for (int x : solve(A,B))
            System.out.print(x + " ");
    }
}
