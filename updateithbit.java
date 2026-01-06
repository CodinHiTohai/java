public class updateithbit {
    public static int updateithebit(int n,int i,int newbit){
         n=clearithbit(n, i);
         int newbitmask=1<<i;
         return n|newbitmask;
         

         
    }
    public static int clearithbit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static void main(String[] args) {
        int n;
        System.out.println(updateithebit(10, 2, 1));
    }
}
