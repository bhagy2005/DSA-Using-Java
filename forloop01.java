// This program demonstrates the use of a for loop in Java. It initializes an array of integers and
// counts the number of times the value '1' appears in the array.
public class forloop01 {
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 0, 9, 8, 3, 1, 0, 1, 2, 1, 2};
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == 1) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
// output: 4
