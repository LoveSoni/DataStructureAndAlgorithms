package patterns;

public class Pattern21 {
    /*
        1234
         234
          34
           4
     */
    public static void main(String[] args) {
        int num = 4;
        for(int i=1;i<=4;i++){
            for(int c = 1; c<i;c++){
                System.out.print(" ");
            }
            int newNum = i;
            for(int j=1;j<=num-i+1;j++){
                System.out.print(newNum++);
            }
            System.out.println();
        }
    }
}
