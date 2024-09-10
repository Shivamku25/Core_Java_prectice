package Flow_Control;

public class Switch_Multiple_Case_Level_Constant_Expression {
    public static void main(String[] args) {
        int x=10;
        switch (x+1)
        {
            case 10:
                System.out.println(10);
                break;
            case 10+20+30:
                System.out.println(60);
        }
    }

}
