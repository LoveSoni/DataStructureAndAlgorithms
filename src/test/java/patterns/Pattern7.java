package patterns;

public class Pattern7 {
    /*
    1
    22
    333
    4444
     */
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
