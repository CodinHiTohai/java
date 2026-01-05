public class trappingrainwater {
    public static int watertrap(int height[]){
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(leftmax[i-1], height[i]);

        }
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1], height[i]);
        }
        int trapwater=0;
        for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            trapwater+=waterlevel-height[i];
        }
        return trapwater;
    }
   public static void main(String[] args) {
    int height[]={4,2,0,6,3,2,5};
    System.out.println(watertrap(height));
   } 
}
