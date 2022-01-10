package recurssion;

public class ReachHome {

    public static void reachHome(int src,int dest){
        if(src > dest){
            return;
        }
        System.out.println("Taking "+ src + " step");
        src = src + 1;
        reachHome(src,dest);
    }

    public static void main(String[] args) {
        reachHome(1,10);
    }
}
