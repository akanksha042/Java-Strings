import java.util.*;



public class Palindrome {
    public static boolean isPalindrome(String name){
        for(int i=0 ; i<(name.length()/2);i++ ){
            int n  =  name.length();
            //  0 1 2 3 4 
            //  m a d a m
    
            if(name.charAt(i) != name.charAt(n-1-i)){
                return false;
                

            }
            
            

            

        }
        return true;

    }
    public static void main(String args[]){
        Scanner sc =  new Scanner (System.in);
        String name  = sc.nextLine();
        // PrintP(name);
        
        System.out.println(isPalindrome(name));
     

       

    }
    
}
