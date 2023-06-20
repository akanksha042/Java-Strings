import java.util.*;


public class Strings{
    public static void main(String []args){
        char arr[] = {'a','b','c','d'};

        String str = "akanksha";
        String str2 = new String("Omkar");


        Scanner sc = new Scanner(System.in);
        // String name  = sc.next();
        String name2 = sc.nextLine();
        // System.out.print("Your name : "+name);
        //but if i write akanksha srivastava it won't take it
        //because of .next()
        //but if we use nextLine we can do it
        // System.out.println();
        System.out.println("my name : " + name2);
        System.out.println("my name : " + name2.charAt(6));





        // String str="ShradhaDidi";
        // String str1="ApnaCollege";
        // String str2="ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));
        // String art="ApnaCollege".replace("l",""); 
        // System.out.println(art);

       




    }
}