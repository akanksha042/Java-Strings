public class StringCompare {
    public static void main(String args[]){
        String str = "Tony";
        String str2= "Tony";
        String str3 = new String("Tony"); 

        //basically we get 2 different outputs
        //because str adn str1 point yo same object but 
        //str3 is totally different objects
        //== checks the is my two things are same equal st object level

        if(str == str2){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }


        if(str == str3){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }



        //therefore we use .equals
        if(str.equals(str3)){
            System.out.println("Euqalllllll");
        }
        else{
            System.out.println("Not Equalssssssssssss");
        }

        
    }
    
}
