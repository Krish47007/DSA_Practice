package competition_3;

public class REc {

    int bar(int x, int y) {
        if (y == 0)
            return 0;
        return x + bar(x, y - 1);
    }

    int foo(int x, int y) {
        if (y == 0)
            return 1;
        return bar(x, foo(x, y - 1));
    }

    public static void main(String[] args) {

        var obj = new REc();
        System.out.println(obj.foo(3, 5));
    }
}
