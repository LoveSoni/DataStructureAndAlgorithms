package twodimensionalpackage;

import java.util.Scanner;

public class InputColumnWise {
    public static void main(String[] args) {
        int[][] array = new int[3][2];
        Scanner cin = new Scanner(System.in);
        for(int i=0;i<array[0].length;i++){
            for(int j=0;j<array.length;j++){
                array[j][i] = cin.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]);
            }  System.out.println();
        }

    }

}
