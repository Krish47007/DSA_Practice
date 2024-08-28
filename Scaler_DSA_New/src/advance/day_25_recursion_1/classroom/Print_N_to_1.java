package advance.day_25_recursion_1.classroom;

public class Print_N_to_1 {

    public static void printNum(int n)
    {
        if(n < 1)
            return;
        System.out.print(n+ " ");
        printNum(n-1);
    }

    public static void main(String[] args) {

        printNum(10);
    }
}
