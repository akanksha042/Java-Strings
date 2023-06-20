import java.util.*;

public class CharAtFun {
    
    public static void main(String args[]){
        Scanner sc  = new Scanner (System.in);
        String name  = sc.nextLine();
        System.out.println(name);
        for(int i=0; i<name.length();i++){
            System.out.print("I am at index :  " + name.charAt(i));
            System.out.println();
        }
        System.out.println("**************************************");

        for(int i=0; i<name.length();i++){
            if(name.charAt(i) == 'A')
            continue;
            System.out.println("I am at index :  " + name.charAt(i));


           // System.out.println();
        }


    }

    
}

//output

// AAbbbAA MDDd
// AAbbbAA MDDd
// I am at index :  A
// I am at index :  A
// I am at index :  b
// I am at index :  b
// I am at index :  b
// I am at index :  A
// I am at index :  A
// I am at index :
// I am at index :  M
// I am at index :  D
// I am at index :  D
// I am at index :  d
// **************************************
// I am at index :  b
// I am at index :  b
// I am at index :  b
// I am at index :
// I am at index :  M
// I am at index :  D
// I am at index :  D
// I am at index :  d
