public class LargestString { 
    public static void main(String args[]){
        String fruits[] ={"Apple", "grapes", "mango","banana", "zebra"};
        String largest = fruits[0];
        for(int i=0;i<fruits.length;i++){
            //str.comapreTo(str2)
            //str.compareToIgnoreCase(str2)
            //0 : equals
            //< 0 : str 1 < str2
            //> 0 : str1 > str2
            if(largest.compareToIgnoreCase(fruits[i]) < 0)
            largest = fruits[i];
            System.out.println("largest : " + largest);

        }
        System.out.print("largest : " + largest);
    }
    
}
