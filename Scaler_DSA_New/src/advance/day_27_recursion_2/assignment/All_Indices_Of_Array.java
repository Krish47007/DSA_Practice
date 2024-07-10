package advance.day_27_recursion_2.assignment;

import java.util.ArrayList;
import java.util.List;

public class All_Indices_Of_Array {

    public static ArrayList<Integer> allIndices(ArrayList<Integer> A, int B) {

        ArrayList<Integer> ans = new ArrayList<>();
        findElement(A,0,ans,B);
        return ans;
    }

    private static void findElement(ArrayList<Integer> A,int idx, ArrayList<Integer> ans,int B)
    {
        if(idx < A.size())
        {
            if(A.get(idx).equals(B))
                ans.add(idx);
            findElement(A,idx + 1,ans,B);
        }
    }

    public static void main(String[] args) {

        for (int x : allIndices(new ArrayList<>(List.of(1,2,2,2,4,3,5,2)),2))
            System.out.print(x+" ");
    }
}
