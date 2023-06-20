public class StringBuilderFunction {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");

        for(char ch = 'a' ; ch<='z'; ch++){
            sb.append(ch);
           
            
        }
        //here loops runs 
        //O(n) or O(26)
        // but if we use string here
        //it will take (26 * n^2)

        System.out.println(sb+ " ");
        System.out.println(sb.length());
        System.out.println(sb.charAt(5));
    }

   
}
