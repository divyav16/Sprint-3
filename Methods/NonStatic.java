package Methods;

public class NonStatic {

    void method(){
        int a= 50;
        int b=60;
        int c;
        System.out.println(c=a+b);

    }
    public static void main(String[] args) {
        NonStatic obj = new NonStatic();
        obj.method();

    }
}
