public class maxElementArr {
    public static void main(String[] args) {

        int [] arr = new int [5];
        arr[0] = -55;
        arr[1] = -4322;
        arr[2] = -71;
        arr[3] = -77;
        arr[4] = -2147;
        int res = Integer.MIN_VALUE; // -2147483648
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > res) {
                res = arr[i];
            }
        }
        System.out.println(res);

    }
}