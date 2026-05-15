// write a program to print a following pattern of stars
public class patterns3{
    public static void main(String[] args){
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<(i*2)+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* output:
    *
   ***
  *****
 *******
*********
*/

public class patterns3{
    public static void main(String[] args){
        int n = 5;
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<(i*2)+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* Output:
*********
 *******
  *****
   ***
    *
*/


public class patterns3{
    public static void main(String[] args){
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<(i*2)+1; k++){
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=n-2; i>=0; i--){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<(i*2)+1; k++){
                System.out.print("*");
            }
        System.out.println();
        }
        
    }
}

/* Output:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/


public class patterns3{
    public static void main(String[] args){
        int n = 6;
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<(i*2)+1; k++){
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<(i*2)+1; k++){
                System.out.print("*");
            }
        System.out.println();
        }
        
    }
}

/* Output:
***********
 *********
  *******
   *****
    ***
     *
    ***
   *****
  *******
 *********
***********
*/

public class patterns3{
    public static void main(String[] args){
        int n = 6;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<(i*2)+1; k++){
                if(i==n-1 || k==0 || k==i*2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
        
    }
}

/* Output:
     *
    * *
   *   *
  *     *
 *       *
***********
*/


public class patterns3{
    public static void main(String[] args){
        int n = 6;
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<(i*2)+1; k++){
                if(i==n-1 || k==0 || k==i*2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
        
    }
}

/* Output:
***********
 *       *
  *     *
   *   *
    * *
     *
*/


public class patterns3{
    public static void main(String[] args){
        int n = 6;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<(i*2)+1; k++){
                if(k==0 || k==i*2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<(i*2)+1; k++){
                if(k==0 || k==i*2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
}

/* Output:
     *
    * *
   *   *
  *     *
 *       *
*         *
 *       *
  *     *
   *   *
    * *
     *
*/


public class patterns3{
    public static void main(String[] args){
        int n = 6;
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(j+1+" ");
            }
        System.out.println();
        }
    }
}

/* Output:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
*/


public class patterns3{
    public static void main(String[] args){
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            for(int k=i; k>=0; k--){
                System.out.print(k+1+" ");
            }
        System.out.println();
        }
    }
}

/* Output:
        1 
      2 1 
    3 2 1 
  4 3 2 1 
5 4 3 2 1 
*/


public class patterns3{
    public static void main(String[] args){
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }
            for(int k=i; k>=0; k--){
                System.out.print((k+1)+" ");
            }
            for(int m=2; m<=i+1; m++){
                System.out.print(m+" ");
            }
        System.out.println();
        }
    }
}

/* Output:
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 
*/