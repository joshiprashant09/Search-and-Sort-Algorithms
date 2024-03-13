package Algorithms;
class LinearSort2D {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int target = 5;
        int[] result = linearSearch2DArray(array, target);
        
        if (result != null) {
            System.out.println("Element found at position: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    
    public static int[] linearSearch2DArray(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
