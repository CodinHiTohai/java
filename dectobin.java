public class dectobin {
    public static void decimaltobinary(int n){
        int decnum=0;
        int pow=0;
        while(n>0){
            int remainder=n%2;
            decnum=decnum+remainder*(int)Math.pow(10, pow);
            pow++;
            n=n/2;
        }
        System.out.println(decnum);
    }
    public static void main(String[] args) {
        decimaltobinary(10);
        int n;
    }
}
