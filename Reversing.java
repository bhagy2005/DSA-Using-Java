// Reversing a string using charAt() method, is used to reverse order of characters in a string. 
// By using a loop to iterate through the string from the last index to the first index, we can print the characters in reverse order.    
// example: BHAGYA -- AYGAHB
public class Reversing {
    public static void main(String[] args) {
        String name = "BHAGYA";
        for(int i=5; i>=0; i--){
            System.out.print(name.charAt(i));
            }
    }
}
// Output: AYGAHB


