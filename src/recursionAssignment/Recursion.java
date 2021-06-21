package recursionAssignment;

public class Recursion{
    /**
     * A method that uses recursion to return the count of
     * occurrences of the number 7, given a digit
     * @param n An integer specified by the user
     * @return An integer indicating the instances of the number seven
     * @author Natalia Garcia-Arias
     */
    public static int count7(int n){
        //Base Case
        if (n == 0 || n < 7){
            return 0;
        //Checks if the rightmost integer is 7, returns 1 + removes rightmost digit
        }else if (n % 10 == 7){
            return 1 + count7(n/10);
        } else {
            return count7(n/10);
        }
    }
    
    /**
     * A method that reucursively, given a string, produces a new string
     * where all instances of "pi" are replaced by "3.14"
     * @param str A string specified by the user
     * @return A string with all appearances of "pi" are replaced by "3.14"
     * @author Natalia Garcia-Arias
     */
    public static String changePi(String str){
        //Base Case
        if (str.length() < 2){
            return str;
        }
        //If an instance of "pi" is found, returns "3.14" + recursive recall
        if (str.substring (0, 2).equals("pi")){
            return "3.14" + changePi(str.substring(2));
        }
        //If no instances of "pi", returns first char + recursive recall
        return str.charAt(0) + changePi(str.substring(1));
    }

    /**
     * A method that recursively, given a string, changes repeated adjacent chars 
     * into a single char. 
     * @param str A string with multiple instances of a char
     * @return A string cleaned of repeated adjacent chars
     * @author Natalia Garcia-Arias
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
