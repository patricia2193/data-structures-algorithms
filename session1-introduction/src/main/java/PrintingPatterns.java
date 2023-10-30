public class PrintingPatterns {


    public static void printPyramid(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }

    public static void printPascalTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            int currentValue = 1;
            for (int column = 1; column <= row; column++) {
                System.out.print(currentValue + " ");
                currentValue = currentValue * (row - column) / column;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid(5);
        printPascalTriangle(6);
    }
}
