package patterns;

public class Pattern16 {
    /*
    D
    CD
    BCD
    ABCD
     */
    public static void main(String[] args) {
        char ch = 'D';
        for (int i = 1; i <= 4; i++) {
            char newChar = ch;
            for (int j = 1; j <= i; j++) {
                System.out.print(newChar++);
            }
            System.out.println();
            ch--;
        }
    }
}
