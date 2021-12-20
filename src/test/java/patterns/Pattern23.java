package patterns;

public class Pattern23 {
    /*
            1
           121
          12321
         1234321
     */
    public static void main(String[] args) {
        int num = 4,space=5;
        for(int i=1;i<=num;i++){
            for(int c=1;c<=space;c++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            int newNum = i;
            for(int k=1;k<=i-1;k++){
                System.out.print(--newNum);
            }
            space--;
            System.out.println();
        }

    }
}
