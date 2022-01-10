package recurssion;

public class LinearSearch {

    public static boolean searchElement(int[] array, int key){
        if(array.length == 0){
            return false;
        }
        if(array[0] == key){
            return true;
        }
        else {
            int[] arrayNew = new int[array.length - 1];
            System.arraycopy(array, 1, arrayNew, 0, arrayNew.length);
            return searchElement(arrayNew,key);
        }
    }

    public static void main(String[] args) {
        int array[] = {1,4,5,6,8};
        System.out.println(searchElement(array,14));
    }
}
