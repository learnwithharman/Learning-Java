// This code demonstrates the creation and usage of a 2D array in Java. It initializes a 2D array with random values and prints them to the console.

public class multidimarray {
    public static void main (String []args){

        int multiArr[][]= new int [2][3]; //Creating a 2D array with 2 rows and 3 columns
        for (int i = 0; i <2; i++){
            for (int j=0; j<3; j++){
                multiArr [i][j]= (int)  (Math.random() * 10); //Filling the array with random values between 0 and 9
            }
        }
        for (int i = 0; i <2; i++){
            for (int j=0; j<3; j++){
                System.out.print(multiArr[i][j] + " "); //Printing the values of the 2D array
            }
            System.out.println();
        }
        for (int n[] : multiArr){ //Using an enhanced for loop to print the values of the 2D array
            for (int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

   
    }
}
