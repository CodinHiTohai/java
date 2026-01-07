public class mergetwosortedarray {
    public static void mergearray(int arr1[],int arr2[]){
        int i=0;

        int j=0;
        int k=0;
        int n=3;
        int m=arr2.length;
        int temp[]=new int[n+m];
        while(i<n&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                temp[k]=arr1[i];
                i++;

            }else{
                temp[k]=arr2[j];
                j++;
            }
k++;
        }while(i<n){
            temp[k++]=arr1[i++];
        }while(j<arr2.length){
            temp[k++]=arr2[j++];
        }
        for (i = 0; i < temp.length; i++) {
    arr1[i] = temp[i];
}

        
    }


    public static void main(String[] args) {
        int arr1[]={1,2,3,0,0,0};
        int arr2[]={2,5,6};

mergearray(arr1, arr2);
for(int i=0;i<arr1.length;i++){
    System.out.print(arr1[i]+" ");
}
    }
}
