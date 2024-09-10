package Flow_Control;

public class Fall_Through_Inside_Switch2 {
    public static void main(String[] args) {
        switch (0)
        {
            default :
                System.out.println("Default");
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
        }
    }
}
