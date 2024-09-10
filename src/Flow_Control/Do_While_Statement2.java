package Flow_Control;

public class Do_While_Statement2 {
    public static void main(String[] args) {
        do {
            System.out.println("Hello");

        }
        //while(true);CE:-> Unreachable statement
        while (false);
        System.out.println("Hi");
    }
}
