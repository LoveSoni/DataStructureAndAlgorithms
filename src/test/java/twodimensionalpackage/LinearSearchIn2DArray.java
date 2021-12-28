package twodimensionalpackage;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};
        int search = 0;
        boolean res= false;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j] == search){
                    res = true;
                }
            }
            System.out.println();
        }
        if(res){
            System.out.println("Element exist in 2d array");
        }
        else{
            System.out.println("Element does not exist");
        }
    }
}
