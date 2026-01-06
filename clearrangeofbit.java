public class clearrangeofbit {
    public static int clearrangeofbit(int n,int j,int i){
    int a=((~0)<<(j+1));
    int b=(1<<i)-1;
    int bistmask=a|b;
    return n&bistmask;

    }

    public static void main(String[] args) {
    System.out.println(clearrangeofbit(10, 4, 2));
    }
}
