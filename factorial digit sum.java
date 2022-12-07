import java.math.BigInteger;

public class Q20 {

    public static void main(String[] args) {
        System.out.println(getSum(100));
    }

    private static long getSum(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        long sum = 0;
        while (fact.compareTo(BigInteger.ZERO) > 0) {
            sum += fact.mod(BigInteger.TEN).longValue();
            fact = fact.divide(BigInteger.TEN);
        }
        return sum;
    }
