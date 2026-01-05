public class kadane {
    public static void kadane(int number[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<number.length;i++){
            sum=sum+number[i];
            if(sum<0){
                sum=0;
            }
            max=Math.max(max, sum);
        

        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        kadane(number);
    }
}
