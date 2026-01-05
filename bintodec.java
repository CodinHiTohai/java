public class bintodec {
    public static int binarytodecimal(int n){
        int binnum=0;
        int pow=0;
        while(n>0){
            int lastdigit=n%10;
            binnum=binnum+lastdigit*(int)Math.pow(2, pow);
            pow++;
            n=n/10;
        }
        return binnum;
    }
    public static void main(String[] args) {
        System.out.println(binarytodecimal(111));
        
    }
}
