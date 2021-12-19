package patterns;

public class Pattern20 {
    /*
        1
       22
      333
     4444
     */
    public static void main(String[] args) {
        int space = 5;
        for(int i=1;i<=4;i++){
            for(int c = 1; c<=space;c++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
            space--;
        }
    }
}
