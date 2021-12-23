package arrays;

public class UniqueNumberAnotherApproach {
    /*
    Previous solution was not good for the given problem
    if we have an array and
    mth element will appear twice
    nth element will appear once
    i.e. only 1 element will be appeared once
    rest element will have 2 occurrence
     */
    public static void main(String[] args) {
        int []a = {1,2,1,4,5,2,3,3};
        int ans = 0;
        for(int i=0;i<a.length;i++){
            ans = ans^a[i];
        }
        System.out.println(ans);
    }
}
