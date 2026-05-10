//Another way to check if a string is a palindrome or not is by using the StringBuilder class in Java. 
/*public class palindrome1{
    public static void main(String[] args){
        String name = "abba"; // index is 0 to 3
        boolean polinbrome = true;
        if(name.charAt(0) != name.charAt(3)){
            polinbrome = false;
        }
        if(name.charAt(1) != name.charAt(2)){
            polinbrome = false;
        }
        if(polinbrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}*/

// Output: Palindrome

// In case String index is more than 50 then we can use for loop to check if the string is a palindrome or not.
public class palindrome1{
    public static void main(String[] args){
        String name = "abccb"; // index is 0 to 5
        int n = name.length();
        boolean palinbrome = true;
        for(int i=0; i<n/2; i++){
            if(name.charAt(i) != name.charAt(n-i-1)){
                palinbrome = false;
                break;
            }
        }
        if(palinbrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
// Output: Not a palindrome