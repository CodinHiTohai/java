public class insertionsort {
    public static void insertionsort(int number[]){
        for(int i=0;i<number.length;i++){
            int curr=number[i];
            int prev=i-1;
            while(prev>=0 &&number[prev]>curr){
                number[prev+1]=number[prev];
                prev--;
            }
            number[prev+1]=curr;
        }
    }
    public static void  print(int number[]){
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
   public static void main(String[] args) {
    int number[]={5,4,3,2,1};
    insertionsort(number);
    print(number);
   } 
}
