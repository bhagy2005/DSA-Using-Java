// This program prints a pattern of stars and dashes in a grid format.
public class patterns1{
    public static void main(String[] args){
        int rows = 3;
        int columns = 20;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print("*");
                if(j!=columns-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/* Output:
    * * * * * * * * * * * * * * * * * * * *
    * * * * * * * * * * * * * * * * * * * *
    * * * * * * * * * * * * * * * * * * * *
*/  

// write a program to print a pattern of stars and dashes in a grid format with 10 rows and 3 columns.
public class patterns1{
    public static void main(String[] args) {
        int rows = 10;
        int columns = 3;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print("*");
                if(j!=columns-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/* Output:
    * * *
    * * *
    * * *
    * * *   
    * * *
    * * *
    * * *
    * * *
    * * *
    * * *
*/



