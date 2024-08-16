package advance.day_32_hashing_1.classroom;

import java.util.HashMap;
import java.util.Map;

public class FreqOfElemForMultipleQueries {

    public static void printFreq(int[] arr,int[] queries)
    {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for (int x : arr)
        {
            freqMap.put(x,freqMap.getOrDefault(x,0) + 1);
        }
        //Run through the queries
        for (int i = 0;i<queries.length;i++)
        {
            System.out.println("Freq of "+queries[i]+" : "+freqMap.getOrDefault(queries[i],0));
        }

    }

    public static void main(String[] args) {

        int[] arr = {2,6,3,6,3,8,2,6};
        int[] queries = {6,8,5};
        printFreq(arr,queries);
    }
}
