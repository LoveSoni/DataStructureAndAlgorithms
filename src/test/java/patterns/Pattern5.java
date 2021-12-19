package patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int sum =1 ;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print(sum++);
            }
            System.out.println();
        }
    }
}
