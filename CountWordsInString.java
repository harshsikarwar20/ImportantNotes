import java.util.*;
public class CountWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = " he  llo wor  ld ind  ia ";

        int count = 0;
        boolean ans = true;

        // for(int i=0; i<str.length(); i++){
        //     if(str.charAt(i)==' '){
        //         count++;
        //     }
        // }
        // System.out.println(count+1);

        //hello    world  india       
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=' '){
                if(ans){
                    count++;
                    ans = false;
                }
            }else{
                ans = true;
            }
        }
        System.out.println(count);
    }
}
