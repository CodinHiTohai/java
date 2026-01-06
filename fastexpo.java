public class fastexpo {
    public static void fastexponential(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)==1){
            ans=ans*a;
            }
            
        }
        a=a*a;
        n=n>>1;
    }
    public static void main(String[] args) {

        
    }
    
}
