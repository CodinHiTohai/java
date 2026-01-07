public class majorityelement{
    public static int findmajorityelement(int arr[]){
        int count=0;
        int person=0;
        for(int i=0;i<arr.length;i++){
            int number=arr[i];
            if(count==0){
                person=number;
            }if(number==person){
                count++;
            }else{
                count--;
            }
            
        }
        return person;
    }
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(findmajorityelement(arr));
    }
}