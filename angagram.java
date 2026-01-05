
import java.util.*;
public class angagram {
    public static void anagrame(String s1,String s2){
        char[] ch1=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2)){
            System.out.println("this is anagram to each other");
        }else{
            System.out.println("this is not angram to each other");
        }

    }
    public static void main(String[] args) {
        String s1="earth";
        String s2="heartj";
        anagrame(s1, s2);
    }
}
