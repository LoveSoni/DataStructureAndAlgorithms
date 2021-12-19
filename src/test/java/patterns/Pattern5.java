package patterns;

public class Pattern5 {
    /*
    1 2 3
    4 5 6
    7 8 9
     */
    public static void main(String[] args) {
        int sum =1 ;
        int num = 5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(sum+++" ");
            }
            System.out.println();
        }
    }
}
