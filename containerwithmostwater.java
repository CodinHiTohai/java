import java.util.*;
public class containerwithmostwater {
    public static int mostwaterincontainer(ArrayList<Integer>list){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int height=Math.min(list.get(i), list.get(j));
                int widht=j-i;
                int currwater=height*widht;
                max=Math.max(max, currwater);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(mostwaterincontainer(list));
        
    }
}
