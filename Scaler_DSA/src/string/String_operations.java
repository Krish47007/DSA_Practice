package string;

public class String_operations {

    private boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }

    public String solve(String A) {

        A += A;
        StringBuilder sb = new StringBuilder();
        for (char ch : A.toCharArray()) {
            if (isVowel(ch))
                sb.append("#");
            else if (!(ch >= 'A' && ch <= 'Z'))
                sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        var obj = new String_operations();
        System.out.println(obj.solve("aeiOUz"));
        System.out.println(obj.solve("AbcaZeoB"));
    }
}
