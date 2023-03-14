package Methods;

public class overloading {

    static int mymethod(int a, int b){
        return a*b;
    }

    static double mymethod(double a, double b){
        return a-b;
    }


    public static void main(String[] args) {
        int total = mymethod(20,5);
        System.out.println(total);
        double result = mymethod(10.5,5.5);
        System.out.println(result);


    }
}
