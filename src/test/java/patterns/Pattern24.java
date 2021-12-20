package patterns;

public class Pattern24 {
    /*
            1234554321
            1234**4321
            123****321
            12******21
            1********1
     */
    public static void main(String[] args) {
        int num = 5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i+1;j++){
                System.out.print(j);
            }
            for(int start=2;start<2*i;start++){
                System.out.print("*");
            }
            int newNum = num-i+1;
            for(int k=1;k<=num-i+1;k++){
                System.out.print(newNum--);
            }
            System.out.println();
        }
    }
}
