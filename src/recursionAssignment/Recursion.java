package recursionAssignment;

public class Recursion{
    public static int count7(int n){
        return 2; //redoing this problem later
        
        
        
        
        
        
        
        



    }
    public static String changePi(String str){
        //Base Case
        if (str.length() < 2){
            return str;
        }
        if (str.substring (0, 2).equals("pi")){
            return "3.14" + changePi(str.substring(2));
        }
        return str.charAt(0) + changePi(str.substring(1));
    }
    
    public static String stringClean(String str){

        //Base case
        if (str.length() < 2){
            return str;

        //If the first character == second character
        } if (str.charAt(0) == str.charAt(1)){

            //Recursive recall, returns substring without the first character
            return stringClean(str.substring(1));
        }
        //Returns the first character + recursive recall
        return str.charAt(0) + stringClean(str.substring(1));
    }

}
