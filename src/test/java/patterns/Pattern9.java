package patterns;

public class Pattern9 {
    /*
    1
    21
    321
    4321
     */
    public static void main(String[] args) {
        int num = 4;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i-j +1);
            }
            System.out.println();
        }
    }
}
