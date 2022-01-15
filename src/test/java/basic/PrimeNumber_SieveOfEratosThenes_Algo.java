package basic;

import java.util.Arrays;

public class PrimeNumber_SieveOfEratosThenes_Algo {

    public static void main(String[] args) {
      int till = 5000000;
      boolean res[] = primeNumber(till);
      for(int i=0;i<res.length;i++){
          if(res[i]){
              System.out.println(i);
          }
      }

    }


    // Complexity of this algo will be 0(n * log(log n) )
    public static boolean[] primeNumber(int number){
        boolean[] allNumbers = new boolean[number+1];
        // by default mark all number as prime i.e. true
        Arrays.fill(allNumbers,true);
        // since 0 and 1 is not prime mark them as false
        allNumbers[0]=allNumbers[1] = false;

        for(int i=2;i<number;i++){
            if(allNumbers[i]){
                for(int j=2*i;j<number;j=j+i){
                    allNumbers[j] = false;
                }
            }
        }
        return allNumbers;
    }
}
