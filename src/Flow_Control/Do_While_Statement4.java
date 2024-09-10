package Flow_Control;

public class Do_While_Statement4 {
    public static void main(String[] args) {
        final int a=10,b=20;
        do {
            System.out.println("Hello");
        }
        //while(a<b); CE:-> Unreachable statement
        while(a>b);
        System.out.println("Hi");
    }
}
