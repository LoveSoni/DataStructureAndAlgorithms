package twodimensionalpackage;

import java.util.Scanner;

public class InputRowWise {
    public static void main(String[] args) {
      int[][] array = new int[3][2];
      Scanner cin = new Scanner(System.in);
      for(int i=0;i<array.length;i++){
        for(int j=0;j<array[0].length;j++){
            array[i][j] = cin.nextInt();
        }
      }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
               System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
