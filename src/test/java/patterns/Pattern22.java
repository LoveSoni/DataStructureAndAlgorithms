package patterns;

public class Pattern22 {
    /*
          1
         23
        456
       78910
     */
    public static void main(String[] args) {
        int  counter=1,space=5;
        for(int i=1;i<=4;i++){
            for(int k=1;k<=space;k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(counter++);
            }
            space--;
            System.out.println();
        }
    }
}
