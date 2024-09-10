package Flow_Control;

public class Switch_Statement_Constant_Expression {
    public static void main(String[] args) {
        int x=10;
        final int y=20;//if we take int y = 20; the we will get CE: constant expression required
        switch (x)
        {
            case 10:
                System.out.println(10);
            case y:
                System.out.println(20);
                break;
        }
    }
}
