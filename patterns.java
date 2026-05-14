// This program prints a square pattern of asterisks (*).
public class patterns {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
                System.out.print("-"); // // space is replaced with a dash (-) for better visibility
            }
            System.out.println();
        }
    }
}
/* Output:
    *-*-*-*-*-
    *-*-*-*-*-
    *-*-*-*-*-
    *-*-*-*-*-
    *-*-*-*-*-
     */



// write a program to print a square pattern of asterisks (*) without using end space after the last asterisk in each row.
public class patterns{
    public static void main(String[] args){
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
                if(j!=n-1){
                    System.out.print("-"); // space is replaced with a dash (-) for better visibility
                }
            }
            System.out.println();
        }
    }
}
/* Output:
    *-*-*-*-* 
    *-*-*-*-* 
    *-*-*-*-* 
    *-*-*-*-* 
    *-*-*-*-*  
*/



// write a program to print a right angled triangle pattern of asterisks (*).
public class patterns{
    public static void main(String[] args){
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/* Output:
    * * * * * 
    * * * * 
    * * * 
    * * 
    *  
*/
