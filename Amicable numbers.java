public class Q21 { 
  public static void main(String[] args) {
    long answer = sumOfAmicablePairs(10000);
    System.out.println("The sum of all amicable pairs is " + answer);
}

    private static int sumOfAmicablePairs(int upTo) {
        int answer = 0;
        for (int i = 1; i < upTo; i++) {
            int a = sumOfProperDivisors(i);
            int b = sumOfProperDivisors(a);
            if (a != b && i == b) {
                answer += a + b;
            }
        }
        return answer / 2; // account for counting each pair twice
    }

    public static int sumOfProperDivisors(int n) {
        int sum = 1;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i + n / i;
                if (i * i == n)
                    sum -= i; // correction for perfect squares
            }
        }
        return sum;
    }

}
