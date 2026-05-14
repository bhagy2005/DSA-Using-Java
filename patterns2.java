// This program prints a hollow square pattern of asterisks (*) with a size of 5x5.
public class patterns2{
    public static void main(String[] args){
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");  
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


/* Output:
    *****
    *   *
    *   *
    *   *
    *****
*/



// write a program to print a hollow square pattern of asterisks (*) with a size of 4x29.
public class patterns2{
    public static void main(String[] args){
        int r = 4;
        int c = 29;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(i==0 || i==r-1 || j==0 || j==c-1){
                    System.out.print("*");  
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



/* Output:
    *****************************
    *                           *
    *                           *
    *****************************
*/


// write a program to print a right angled triangle pattern of asterisks (*) with 5 rows and 5 columns, 
// but the triangle should be aligned to the right side of the output.
public class patterns2{
    public static void main(String[] args){
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                    System.out.print(" ");  
             }
             for(int k=0; k<5; k++){
                 System.out.print("*");
             }
            System.out.println();
        }
    }
}
/* Output:
     *****
    *****
   *****
  *****
 *****
*/