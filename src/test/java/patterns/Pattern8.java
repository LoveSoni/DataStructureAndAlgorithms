package patterns;

public class Pattern8 {
    /*
    1
    23
    456
    78910
     */
    public static void main(String[] args) {
        int num = 4;
        int sum = 1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(sum++);
            }
            System.out.println();
        }
    }
}
