package recursionAssignment;

public class Recursion{
    public static int count7(int n){

        //Base Case
        if (n == 0 || n < 7){
            return 0;
        } else if (n % 10 == 7){
            return 1 + count7( n/10);
        } else {
            return count7(n/10);
        }
        
    }
    public static String changePi(String str){
        //Base Case
        if (str.length() < 2){
            return str;
        }
        if (str.substring (0, 2).equals("pi")){
            return "3.14" + changePi(str.substring(2));
        }
        return str;
    }

}
