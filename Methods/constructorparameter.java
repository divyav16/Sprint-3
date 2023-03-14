package Methods;

public class constructorparameter {

    int y;

    String name = "Total Students ";

    constructorparameter(int j, int k,String name){

        y=j+k;

    }
    public static void main(String[] args) {
        constructorparameter myobj = new constructorparameter(10,20, "Total Students");
        System.out.println(myobj.y+ " " + myobj.name);

    }
}
