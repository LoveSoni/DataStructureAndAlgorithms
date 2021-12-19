package patterns;

public class Pattern12 {
    /*
    ABC
    DEF
    GHI
     */
    public static void main(String[] args) {
        char ch = 'A';
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
