package bits;

public class Single_Number {

    //We can use this formula -> a^a = 0, so in the array all elements are duplicate except one
    // so if we keep xoring all elements then in the end we will get the single element.

    public int singleNumber(final int[] A) {

        int sum = 0;
        for (int x : A)
            sum ^= x;

        return sum;
    }
}
