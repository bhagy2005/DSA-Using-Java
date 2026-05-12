// ASCII is universal character encoding standard that assigns a unique number to each character.
public class ascii {
    public static void main(String[] args) {
        int a = 'A'; //uppercase 
        int b = 'a'; //lowercase
        int c = '0'; //digits 0 to 9
        int d = ' '; //space
        int e = '!'; //special characters
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
/* Output:
    65
    97
    48
    32
    33  */



// typecasting is the process of converting one data type to another data type. 
// In Java, we can use typecasting to convert a character to its corresponding ASCII value.
public class ascii {
    public static void main(String[] args) {
        char ch = 'A';
        int ascii = (int) ch; // typecasting char to int
        System.out.println(ascii);
    }
}
/* Output:
    65  */

// we can also use typecasting to convert an ASCII value to its corresponding character.
public class ascii {
    public static void main(String[] args) {
        int ascii = 65;
        char ch = (char) ascii; // typecasting int to char
        System.out.println(ch);
    }
}
/* Output:
    A  */   


// we can also use typecasting to convert a string to its corresponding ASCII values.
public class ascii {
    public static void main(String[] args) {
        String str = "Hello";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int) ch; // typecasting char to int
            System.out.println(ascii);
        }
    }
}    
/* Output:
    72
    101
    108
    108
    111  */

// we can also perform arithmetic operations on ASCII values. For example, we can add two ASCII values. 
public class ascii{
    public static void main(String[] args){
        System.out.println('A' + 'B'); // adding ASCII values of A and B
        System.out.println('A' - 'B'); // subtracting ASCII values of A and B
        System.out.println('A' + "B"); // concatenating characters A and B
        System.out.println("A" + "B"); // concatenating strings A and B
    }
}

/* Output:
    131
    -1
    AB
    AB  */


// In the above example to get the output of -1, but I want to get the output of 1, how can I do that?
// In that case, we can use the absolute value function to get the absolute value of the difference between the ASCII values of A and B.
// We can use the Math.abs() function to get the absolute value of the difference between the ASCII values of A and B, as shown below:
public class ascii{
    public static void main(String[] args){
        System.out.println(Math.abs('A' - 'B')); // getting the absolute value of the difference between the ASCII values of A and B
    }
}
// Output:
// 1


/* write a program to print the ASCII values of absolute difference between the ASCII values of adjcent characters in a string.
   "hello" -> h and e -> 104 and 101 -> 3
              e and l -> 101 and 108 -> 7
              l and l -> 108 and 108 -> 0
              l and o -> 108 and 111 -> 3
              3 + 7 + 0 + 3 = 13 */
public class ascii{
    public static void main(String[] args){
        String str = "hello";
        int ans = 0;
        for(int i=0; i<str.length()-1; i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            int ascii1 = (int) ch1;
            int ascii2 = (int) ch2;
            int diff = Math.abs(ascii1 - ascii2);
            ans += diff;
        }
        System.out.println(ans);
    }
}

// Output:
// 13


