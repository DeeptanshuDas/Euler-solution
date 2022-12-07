public class fibo {
    public static void main(String[] args) {
     
        int n1 = 0;
        int n2 = 1;
        int temp = 0;
        int sum = 0;

        do {
            if (n2 % 2 == 0) {
                sum = sum + n2;
            }
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        } while (n2 < 4000000);

        System.out.println(sum);
    }
}

        
    

