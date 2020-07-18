package Generic;

public class MaximumTest {

    // 比较三个值并返回最大值
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if( y.compareTo(max) > 0 ) {
            max = y;
        }
        if( z.compareTo(max) > 0 ) {
            max = z;
        }
        return max;
    }

    public static void main( String[] args ) {
        System.out.printf("%d %d %d 中最大的值： %d\n\n", 3,4,5,maximum(3,4,5));
    }

}
