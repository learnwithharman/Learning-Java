public class jaggedArray {
    public static void main (String[]args){
        int jaggedArr[][]= new int [3][];
        jaggedArr[0]= new int [2]; //First row has 2 columns
        jaggedArr[1]= new int [3]; //Second row has 3 columns
        jaggedArr[2]= new int [4]; //Third row has 4 columns
        for (int i = 0; i < jaggedArr.length; i++){
            for (int j=0; j<jaggedArr[i].length; j++){
                jaggedArr [i][j]= (int)  (Math.random() * 10); //Filling the jagged array with random values between 0 and 9

            }

        }
        // printing values of jagged array using enhanced for loop
        for (int n[] : jaggedArr){
            for (int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

}
