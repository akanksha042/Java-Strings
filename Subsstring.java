public class Subsstring {

    public static String SubsStringPrint(String str, int start, int end){
        String substr = "";
        for(int i=start; i<end;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str = "Hello Akanksha";
        System.out.println("Substring is : " + SubsStringPrint(str, 3, 9));


        //another method
        System.out.println(str.substring(3,9));


        

    }


    
}
