// This program demonstrates the use of the modulus operator in Java. 
// It initializes an array of integers and counts how many of them are divisible by 3.
public class modulus {
    public static void main(String[] args) {
        int arr[] = {5, 4, 6, 12, 2};
        int count = 0;
        for(int i = 0 ; i < 5 ; i++) {
            int temp = arr[i];
            if ( temp % 3 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
// Output: 2
