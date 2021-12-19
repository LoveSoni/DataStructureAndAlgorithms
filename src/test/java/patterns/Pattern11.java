package patterns;

public class Pattern11 {
    /*
    ABC
    ABC
    ABC
     */
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            char ch = 'A';
            for(int j=1;j<=3;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
