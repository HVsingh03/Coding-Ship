package Methods;

public class MethodOverloading {
    static void change(int a){
        a= 98;
    }
    static void change2(int arr[]){
        arr[0]= 98;
    }
    static void telljoke(){
        System.out.println("motu");
    }

    public static void main(String[] args) {
//        telljoke();
        int [] marks= {1,2,3,4};
        change2(marks);
        System.out.println(marks[0]);
//        int x= 45;
//        change(x);
//        System.out.println("x after running " + x);
        
    }
}
