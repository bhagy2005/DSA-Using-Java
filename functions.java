/* A function is a block of code that performs a specific task. 
It is a reusable piece of code that can be called multiple times in a program.
Functions help to break down a large program into smaller, manageable pieces, making it easier to read and maintain.

In general print the name multiple times, we can use a for loop to print the name multiple times. 
But this is not a good way to do it. We can use a function to do this. A function can take parameters and return values, 
making it more flexible and reusable.*/
public class functions{
    public static void main (String[] args){
        String name = "Bindhu";
        for(int i=0; i<3; i++){
            System.out.println(name);
        }
    }
}
/* Output:
   Bindhu
   Bindhu
   Bindhu */


/*In the above example, we have used a for loop to print the name multiple times. 
But this is not a good way to print the name multiple times. We can use a function to do this.
A function can take parameters and return values, making it more flexible and reusable.*/
public class functions{
    public static void fun(String name, int n){
        for(int i=0; i<n; i++){
            System.out.println(name);
        }
    }
    public static void main (String[] args){
        fun("Bindhu", 3);
        fun("Manasa",2);
    }
}
/* Output:
   Bindhu
   Bindhu
   Bindhu  
   Manasa
   Manasa */


// In another way, we can use a function to return a string that contains the name repeated multiple times.
public class functions{
    public static void bhagya(){
        System.out.println("Bindhu");
        System.out.println("Manasa");
    }
    public static void main(String[] args){
        bhagya();
        bhagya();
    }
}
/* Output:
   Bindhu       
   Manasa
   Bindhu
   Manasa
   Bindhu
   Manasa   

/*void is a return type that indicates that the function does not return any value.
  If we want to return a value from a function, we can use a return type other than void. 
  For example, we can use String as a return type to return a string that contains the name repeated multiple times.
  In case we can use void and  return type is String abserve the belowcode, what will be the output of the below code?*/
public class functions{
    public static void fun(){
        return "Bindhu";
    }
    public static void main(String[] args){
        System.out.println(fun());
    }
}
// Output:
// error: incompatible types: unexpected return value


/*In the above code, we have declared a function fun() that has a return type of void.
However, we are trying to return a string from the function, which is not allowed.
To fix this error, we need to change the return type of the function to String, as shown below:*/
public class functions{
    public static String fun(){
        return "Bindhu";
    }
    public static void main(String[] args){
        System.out.println(fun());
    }
}
// Output:
// Bindhu   

// Same as integer, we can also use String as a return type for a function.
public class functions{
    public static String fun(){
        return "Bindhu";
    }
    public static void main(String[] args){
        System.out.println(fun());
    }
}
// Output:
// 3