package Methods;

public class Constructor {

    int a=45;
    Constructor(){
        a=55;
        a=45;
        a=75;
//Whatever will  be the last value it will only print that
    }
    public static void main(String[] args) {
        Constructor obj = new Constructor();

        System.out.println(obj.a);


    }
}
