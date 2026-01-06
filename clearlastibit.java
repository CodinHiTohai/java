public class clearlastibit {
    public static int clearlastiestbit(int n,int i){
        int bistmask=(~0)<<i;
        return n&bistmask;
    }
    public static void main(String[] args) {
        int n=15;
        System.out.println(clearlastiestbit(n, 2));
    }
}
