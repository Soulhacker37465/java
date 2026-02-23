public class CWG_multidimensionalArray {
    public static void main(String[] args) {
        // int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        // Display the elements of the multidimensional array
        // System.out.println("The elements of the multidimensional array are:");
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println(); // Move to the next line after each row
        // }
        int[][][] arr3D = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        // Display the elements of the 3D array
        System.out.println("The elements of the 3D array are:");
        for (int i = 0; i < arr3D.length; i++) {
            for (int j = 0; j < arr3D[i].length; j++) {
                for (int k = 0; k < arr3D[i][j].length; k++) {
                    System.out.print(arr3D[i][j][k] + " ");
                }
                System.out.println(); // Move to the next line after each row
            }
            System.out.println(); // Move to the next line after each 2D array
        }
    }
}
