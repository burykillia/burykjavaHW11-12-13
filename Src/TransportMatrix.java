import java.util.Scanner;

public class TransportMatrix {
    public static void main(String[] args){
        int m, n;
        Scanner in =new Scanner(System.in);
        System.out.print("Задайте розмір матриці m: ");
        m = in.nextInt();
        System.out.print("Задайте розмір матриці n: ");
        n = in.nextInt();
        int fMatrix [][] = new int[m][n];
        int sMatrix [][]=new int[n][m];
        for (int i = 0; i < fMatrix.length; i++) {
            for (int j = 0; j < fMatrix[i].length; j++) {
                fMatrix[i][j] = (int) (Math.random() * 9);
            }
        }
        for (int i = 0; i < sMatrix.length; i++) {
            for (int j = 0; j < sMatrix[i].length; j++) {
                sMatrix[i][j] = fMatrix[j][i];
            }
        }
        for (int i = 0; i < fMatrix.length; i++) {
            for (int j = 0; j < fMatrix[i].length; j++) {
                System.out.print(fMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < sMatrix.length; i++) {
            for (int j = 0; j < sMatrix[i].length; j++) {
                System.out.print(sMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
