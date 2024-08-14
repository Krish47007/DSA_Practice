package advance.day_36_quick_sort_and_comparator.assignment;

public class Sort_by_Color {


    public int[] sortColors(int[] A) {

        int zc = 0,oc = 0,tc = 0;

        for (int i = 0;i<A.length;i++)
        {
            switch (A[i])
            {
                case 0 : zc++;
                        break;
                case 1 : oc++;
                         break;
                case 2 : tc++;
                         break;
            }
        }
        int idx = 0;
        while (zc > 0) {
            A[idx++] = 0;
            zc--;
        }
        while (oc > 0) {
            A[idx++] = 1;
            oc--;
        }
        while (tc > 0) {
            A[idx++] = 2;
            tc--;
        }

        return A;
    }

    public static void main(String[] args) {

        var obj = new Sort_by_Color();

        for (int x : obj.sortColors(new int[]{0, 1, 2, 0, 1, 2}))
        {
            System.out.print(x+" ");
        }
    }
}
