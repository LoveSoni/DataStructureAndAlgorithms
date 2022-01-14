package twodimensionalpackage;

import java.util.ArrayList;
import java.util.List;

public class SpiralPrint {
    /*
    Input:  1    2   3   4
            5    6   7   8
            9   10  11  12
            13  14  15  16
    Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
     */
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> list = new ArrayList<>();
        int numberOfRows = a.length;
        int numberOfColumns = a[0].length;
        int totalElements = numberOfColumns * numberOfRows;
        int count = 0;
        int startingRow = 0;
        int startingColumn  =0;
        int endingRow = numberOfRows-1;
        int endingColumn = numberOfColumns -1;
        while(count<totalElements){
            // print starting row
            for(int i=startingColumn;count<totalElements && i<endingColumn;i++){
                list.add(a[startingRow][i]);
                count++;
            }
            startingRow++;
            // print starting column
            for(int i=startingRow;count<totalElements && i<endingRow;i++){
                list.add(a[i][endingColumn]);
                count++;
            }
            endingColumn--;

            //print ending row
            for(int index=endingColumn; count<totalElements && index>=startingColumn;index--){
                list.add(a[endingRow][index]);
                count++;
            }
            endingRow--;

            //print starting column
            for(int index=endingRow;count<totalElements && index>=startingRow;index--){
                list.add(a[index][startingColumn]);
                count++;
            }
            startingColumn++;
        }
    }
}
