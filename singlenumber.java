public class singlenumber{
    public static int countsinghle(int number[]){
        int count=0;
        int person=0;
        for(int i=0;i<number.length;i++){
        int num=number[i];
            if(num=){
                person=number[i];
            }if(person==number[i]){
                count++;
            }else{
                count--;
            }

        }
        return person;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,2,3};
        System.out.println(countsinghle(number));

    }
}