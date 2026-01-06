public class setibit {
    public static int setibit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
   public static void main(String[] args) {
    int n=10;
    System.out.println(setibit(n, 2));

   } 
}
