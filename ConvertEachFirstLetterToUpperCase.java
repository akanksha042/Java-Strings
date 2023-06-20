public class ConvertEachFirstLetterToUpperCase {
    //O(n);
    public static String UpperCasePrint(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length();i++){
            //not required that && wala part it will still runs fine
        
            if(str.charAt(i) == ' '  && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                


                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
                
            }
            else{
                sb.append(str.charAt(i));
            }

        }
        //System.out.println(sb);
        return sb.toString();

    }


    public static void main(String args[]){
        String str = "hello akanksha how are You ? ";
        System.out.println(UpperCasePrint(str));
        

    }
    
}
