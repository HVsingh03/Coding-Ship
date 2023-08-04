package Methods;

public class Calculator {
    static int logic(int x, int y){
        int z;
        if (x>y){
            z= (x - y);
        }
        else {
            z= (x*y);
        }
        return z;
    }

    public static void main(String[] args) {
        int a= 5; int b= 2;
        System.out.println(logic(a,b));

        int c= 6; int d= 8;
        System.out.println(logic(c,d));
    }
}
