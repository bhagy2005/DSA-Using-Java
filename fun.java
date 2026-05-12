// In the above example, we have used a for loop to print the name multiple times in a single line.
public class fun{
    public static String fun(int n, String name){
        String name2 = " ";
        for(int i=0; i<n; i++){
            name2 = name2 + name;
        }
        return name2;
    }
    public static void main(String[] args){
        String s = fun(5,"Bindhu ");
        System.out.println(s);
    }
}
// Output:
// Bindhu Bindhu Bindhu Bindhu Bindhu


// Arthmetic functions are functions that perform arithmetic operations like addition, subtraction, multiplication, and division.
public class fun{
    public static int fun(int n){
        return n+5;
    }
    public static void main(String[] args){
        int number = fun(25);
        System.out.println(number);
    }
}
// Output:
// 30

// array functions are functions that perform operations on arrays like finding the maximum element, minimum element, sum of elements, etc.
public class fun{
    public static int[] fun(){
        int[] arr = {1,2,3,4,5};
        return arr;
    }
    public static void main(String[] args){
        int[] num = fun();
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
    }
}
/* Output:
 1
 2
 3    
 4
 5*/