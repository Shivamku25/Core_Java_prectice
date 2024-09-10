package Flow_Control;

public class Fall_Through_Inside_Switch {
    public static void main(String[] args) {
        switch (2)
        {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Default");

        }
    }
}
