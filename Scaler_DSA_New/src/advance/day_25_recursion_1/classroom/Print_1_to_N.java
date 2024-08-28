package advance.day_25_recursion_1.classroom;

public class Print_1_to_N {

    public static void printNum(int n)
    {
        if(n == 1) {
            System.out.print(1+" ");
            return;
        }
        printNum(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {

        printNum(100);
    }
}
