package basicmaths;

public class EuclidsAlgo {
    // gdc : greatest common divisor
    // lets say we have two numbers given
    //      2|24                       2|72
    //      2|12                       2|36
    //      2|6                        2|18
    //      3|3                        2|9
    //       |1                        3|3
    //                                 3|1
    //
    //      2 * 2 * 2 * 3
    //      2 * 2 * 2 * 2 * 3 * 3
    // common part is 2 * 2 * 2 * 3 = 24
    // 24 is greater common divisor


    // formula to find gdc is :
    // gcd(a,b) = gcd(a-b, b)
    // OR


    public static void main(String[] args) {
        int a = 24;
        int b = 72;
        System.out.println(gdc(a,b));
    }

    public static int gdc(int a, int b){
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        while(a!=b){
            if(a>b){
                a= a-b;
            }
            else{
                b = b-a;
            }
        }
        return a;
    }
}

