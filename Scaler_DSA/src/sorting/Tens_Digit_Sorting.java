package sorting;

import java.util.ArrayList;
import java.util.List;

public class Tens_Digit_Sorting {

    private int getTensPlaceNum(int a) {
        return (a / 10) % 10;
    }

    public ArrayList<Integer> solve(ArrayList<Integer> list) {

        list.sort((a, b) -> {
            int tp1 = a <= 9 ? 0 : getTensPlaceNum(a);
            int tp2 = b <= 9 ? 0 : getTensPlaceNum(b);

            if (tp1 < tp2)
                return -1;
            else if (tp1 == tp2) {
                if (b < a)
                    return -1;
                else return 1;
            } else
                return 1;
        });

        return list;
    }

    public static void main(String[] args) {

        var obj = new Tens_Digit_Sorting();
        System.out.println(obj.solve(new ArrayList<>(List.of(15, 11, 7, 19))));
        System.out.println(obj.solve(new ArrayList<>(List.of(2, 24, 22, 19))));
    }
}
