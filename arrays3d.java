public class arrays3d {
    public static void main(String[] args) {

        int[][][] array3d = new int[4][4][4];

        for (int i = 0; i < array3d.length; i++) {
            for (int j = 0; j < array3d[i].length; j++) {
                for (int k = 0; k < array3d[i][j].length; k++) {

                    array3d[i][j][k] = (int)(Math.random() * 100);
                    System.out.print(array3d[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println(); // separate blocks
        }
    }
}