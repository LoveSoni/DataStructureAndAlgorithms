package patterns;

public class Pattern10 {
    /*
    AAA
    BBB
    CCC
     */
    public static void main(String[] args) {
        char ch = 'A';
//        System.out.println(++ch);
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
}
