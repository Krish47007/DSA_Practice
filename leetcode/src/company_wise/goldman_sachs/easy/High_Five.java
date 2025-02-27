package company_wise.goldman_sachs.easy;

import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class High_Five {

    /*
        We are using TreeMap<ID,PriorityQueue> as we want to have the output as sorted order of ids.
        Also we need top 5 marks of each student so we need a max heap.
        T.C : O(N * log N)
     */
    public static int[][] highFive(int[][] items) {

        Map<Integer, PriorityQueue<Integer>> map = new TreeMap<>();
        for (int[] arr : items)
        {
            int id = arr[0], marks = arr[1];
            PriorityQueue<Integer> pq = map.getOrDefault(id,new PriorityQueue<>(Comparator.reverseOrder()));
            pq.add(marks);
            map.put(id,pq);

        }
        int[][] ans = new int[map.size()][2];
        int k = 0;
        for (int id : map.keySet())
        {
            int count = 5, sum = 0;
            PriorityQueue<Integer> pq = map.get(id);
            while (count > 0) {
                sum += pq.poll();
                count--;
            }

            ans[k][0] = id;
            ans[k][1] = sum/5;
            k++;

        }
        return ans;
    }

    public static void main(String[] args) {

        for (int[] ans : highFive(new int[][]{{1,91},{1,92},{2,93},{2,97},{1,60},
                {2,77},{1,65},{1,87},{1,100},{2,100},{2,76}}))
        {
            System.out.println("Id : "+ ans[0] + " : "+ "Avg marks : "+ ans[1]);
        }
    }
}
