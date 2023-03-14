package Methods;

public class Staticmethodparameter {


    static void myMethod (String name){
        System.out.println(name + "Tester 1");
        System.out.println(name + "Tester 2");
    }


     public static void main(String[] args) {

        myMethod(  "Seniour ");
        myMethod(  "Juniour ");


    }
}


