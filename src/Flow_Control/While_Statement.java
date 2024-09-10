package Flow_Control;

public class While_Statement {
    public static void main(String[] args) {
          int x = 10,y = 20;
        // if we can use Final int x=10,y=20; then we will get CE: Unreachable statement
        while(x<y)//o/p -> Hello Infinite times ,if we can use while(x>y) then o/p -> Hi.
        {
            System.out.println("Hello");
        }
        System.out.println("Hi");
    }
}
