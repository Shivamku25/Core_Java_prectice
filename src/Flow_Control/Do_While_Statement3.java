package Flow_Control;

public class Do_While_Statement3 {
    public static void main(String[] args) {
        int x=10,y=20;
        do {
            System.out.println("Hello");
        }
        while (x<y);//O/P -> Hello Infinite times.
        //while(x>y);O/P -> Hello,Hi.
        System.out.println("Hi");
    }
}
