public class geiithbit {
    public static int getithbit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;

        }else{
            return 1;
        }
    
    }
    public static void main(String[] args) {
int n=10;
System.out.println(getithbit(n, 2));
    }
}
