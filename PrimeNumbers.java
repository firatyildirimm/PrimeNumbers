public class PrimeNumbers {
    public static void main(String[] args) {
        int num;
        for(int i=2; i<=100; i++){
            num=0;
            for(int j=2; j<=i/2; j++){
                if(i%j==0) num++;
            }
            if(num==0) System.out.print(i+ " ");
        }
    }
}

