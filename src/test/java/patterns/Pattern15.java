package patterns;

public class Pattern15 {
    /*
    A
    BC
    CDE
    DEFF
     */
    public static void main(String[] args) {
        char ch = 'A';
        for(int i=1;i<=4;i++){
            char testChar = ch;
            for(int j=1;j<=i;j++){
                System.out.print(testChar++);
            }
            ch++;
            System.out.println();
        }
    }
}
