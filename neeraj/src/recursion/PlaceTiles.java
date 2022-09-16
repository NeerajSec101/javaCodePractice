package recursion;
//count total ways of placing tile 1xm at the floor nxm.
public class PlaceTiles {
    public static int placeTile(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //place verticaly
        int vertPlace = placeTile(n-m,m);

        //place horizontaly
        int horiPlace = placeTile(n-1,m);

        return vertPlace + horiPlace;
    }

    public static void main(String[] args) {
        int n=4,m=6;
        int totalWayOfPlacemnts = placeTile(n,m);
        System.out.println("total ways of placement tiles: "+totalWayOfPlacemnts);
    }
}
