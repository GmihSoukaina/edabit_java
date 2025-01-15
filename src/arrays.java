import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); // is problem
        System.out.println(Arrays.toString(numbers));


        int[] num = { 1, 5, 3, 4, 2, 8};
        System.out.println(num); // is problem
        System.out.println(num.length);
        // arrays have a fixed length

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));


        MultiDimensionalArrayExample.run();
    }

    public class MultiDimensionalArrayExample {
        public static void run() {
            int [][] nmbr = new int[2][5]; //2 rows and 3 columns
            nmbr [0][0] = 1;
            nmbr [1][1] = 1;
            nmbr [1][2] = 1;
            System.out.println(Arrays.toString(nmbr)); // is problem
            System.out.println(Arrays.deepToString(nmbr));




            int[][] matrix = {
                    {1, 2, 3, 2},
                    {4, 5, 6, 4},
                    {7, 8, 9, 8}
            };
            System.out.println(Arrays.deepToString(matrix));
        }
    }
}
