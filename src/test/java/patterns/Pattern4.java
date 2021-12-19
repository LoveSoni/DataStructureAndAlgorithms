package patterns;

public class Pattern4 {
    /**
     *
     * 321
     * 321
     * 321
     */
    public static void main(String[] args) {
       int n = 3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(n-j+1);
            }
            System.out.println();
        }
    }
}
