import java.util.*;
public class NumberOfVowelsInString {

    public static int Conversion(String str){
        int count =0;
        for(int i=0 ; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();
        System.out.println(Conversion(str));

    }
    
}
