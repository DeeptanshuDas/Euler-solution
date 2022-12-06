public class fibo {
    public static void main(String[] args) {
        int n1=2;
        int n2=4;
        int n3;
        int i;
int count=10;

        for(i=2;i<count;++i){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            ++i;

        }
    }
}
