// This program demonstrates the use of the logical OR operator in Java.
// It initializes an array of integers and counts how many of them are either 2 or 3.
public class or_operator {
    public static void main(String[] args){
        int arr[] = {3, 2, 1, 5, 7, 8, 1, 4, 1, 2, 1, 4, 6};
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] % 2 == 0 || arr[i] % 3 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
// Output: 3
