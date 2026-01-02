public class primeinrange {
    
    public static boolean isprime(int n){
        boolean prime=true;

        for(int i=2;i<n;i++){
            if(n%i==0){
                prime=false;
                break;

            }
        }
    return prime;
    }
    public static void primesinrange(int n){
        for(int i=2;i<n;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int n=10;
        primesinrange(n);
    }
}


