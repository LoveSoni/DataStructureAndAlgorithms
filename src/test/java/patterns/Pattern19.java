package patterns;

public class Pattern19 {
    /*
    1111
     222
      33
       4
     */
    public static void main(String[] args) {
        int num = 4;
        for(int i=1;i<=4;i++){
            for(int space=1;space<i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=num - i +1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
