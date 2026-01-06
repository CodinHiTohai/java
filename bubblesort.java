public class bubblesort {
    public static void bubblesort(int number[]){
        for(int i=0;i<number.length-1;i++){
            for(int j=0;j<number.length-i-1;j++){
                if(number[j]>number[j+1]){
                   int temp=number[j+1];
                   number[j+1]=number[j];
                   number[j]=temp;
                }
            
            }
        }
    }
    public static void print(int number[]){
        for(int i=0;i<number.length;i++){
            System.err.print(number[i]+" ");
        }
    }
    public static void main(String[] args) {
        int number[]={5,4,3,2,1};
        bubblesort(number);
        print(number);
    }
}
