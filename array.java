class printArray{
    public void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print("Value at index " + i + ": " + arr[i] + "\n");
        }
        System.out.println();
    }
}

// arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
public class array{
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5};
        nums[1] = 10; //Updating the value at index 1

        int dynamicArray[] = new int[5];  //Creating an dynamic array of size 5
        dynamicArray[0] = 1;
        dynamicArray[1] = 2;
        dynamicArray[2] = 3;
        dynamicArray[3] = 4;
        dynamicArray[4] = 5;

        printArray arr= new printArray();
        arr.print(nums);
        arr.print(dynamicArray);
    }
} 