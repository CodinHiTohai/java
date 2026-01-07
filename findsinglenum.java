public class findsinglenum {
    public static void singlenumberfind(int arr[]){
        int num=0;
        for(int i=0;i<arr.length;i++){
            num=num^arr[i];
        }
        System.out.println(num);
    }
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        singlenumberfind(arr);
    }
}
