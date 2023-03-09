import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double[][] arr = createArr();
        double sum = 0;
        System.out.println("Nhập vào cột cần tính: ");
        int columNumber = scanner.nextInt();


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        if (columNumber > arr[0].length){
            System.out.println("Nhập lại số cột ");
        }else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (columNumber == j) {
                        sum += arr[i][j];
                    }
                }
            }
            System.out.println("Tổng cột :" +sum);
        }
    }

    static double[][] createArr() {
        System.out.println("Nhập số hàng: ");
        int row = scanner.nextInt();
        System.out.println("Nhập vào cột: ");
        int colum = scanner.nextInt();
        double[][] arr = new double[row][colum];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập vào phần tử thứ: " + i + "." + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }
}