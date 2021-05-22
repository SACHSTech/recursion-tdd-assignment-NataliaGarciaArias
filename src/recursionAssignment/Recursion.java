package recursionAssignment;

public class Recursion{
    /**
     * 
     * @param n
     * @return
     */
    public static int count7(int n){
        
        if (n == 0 || n < 7){
            return 0;
        }
        return 2;
        
        
        
        
        
        
        
        



    }
    
    /**
     * 
     * @param str
     * @return
     */
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

    /**
     * 
     * @param str
     * @return
     */
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
