// This program checks if a given string is a palindrome or not. 
// A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward.
/*public class palindrome {
    public static void main(String[] args) {
        String name = "BHAGYA";
        String name2 = "";
        for(int i=5; i>=0; i--){
            name2 = name2 + name.charAt(i);
        }
        if(name.equals(name2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}*/
// Output: Not a palindrome

public class palindrome {
    public static void main(String[] args) {
        String name = "abccba";
        String name2 = "";
        for(int i=5; i>=0; i--){
            name2 = name2 + name.charAt(i);
        }
        if(name.equals(name2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
