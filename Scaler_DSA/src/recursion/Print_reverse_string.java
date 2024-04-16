package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Print_reverse_string {

    private static void printStringRevOrder(char[] str, int idx) {
        if (idx < 0)
            return;
        System.out.print(str[idx]);

        printStringRevOrder(str, idx - 1);

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        printStringRevOrder(s.toCharArray(), s.length() - 1);
    }
}
