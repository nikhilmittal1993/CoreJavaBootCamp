public class ArrayExample {

    public static void main(String[] args) {

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int[] age = {12, 4, 5, 2, 5};
        age[3] = 99;
        for (int i = 0; i < 5; ++i) {
            System.out.println("Element at index " + i + ": " + age[i]);
        }

//2D array
        int arr1[][] = new int[2][2];

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[1][0] = 3;
        arr1[1][1] = 4;

        for (int i = 0; i < arr1.length; i++) {
            int a[] = arr1[i];
            for (int j = 0; j < a.length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }


        int arr[][] = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};


        for (int i = 0; i < arr.length; i++) {
            int nestedArray[] = arr[i];
            for (int j = 0; j < nestedArray.length; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }


    }
}
