package basicmaths;

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;

public class FasterExponention {
    // find power of number using linear approach has complexity of o(n)
    // but with faster exponention we can solve it in o(logn)
    public static void main(String[] args) {
        int number = 2;
        int power = 5;
        int res = 1;
        for(int i=1;i<=power;i++){
            res = res * number;
        }
        System.out.println(res);
        int limit = (int) (floor(sqrt(power))+1);
        System.out.println(limit);
    }
}
