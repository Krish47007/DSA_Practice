package advance.day_25_recursion_1.classroom;

public class Print_N_To_1_And_1_to_N {

    public static void printNum(int n)
    {
        if(n == 0)
            return;
        System.out.print(n + " ");
        printNum(n-1);
        System.out.print(n+ " ");
    }

    public static void main(String[] args) {

        printNum(5);
    }
}
