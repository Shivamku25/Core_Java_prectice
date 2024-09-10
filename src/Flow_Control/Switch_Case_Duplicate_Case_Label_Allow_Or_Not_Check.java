package Flow_Control;

public class Switch_Case_Duplicate_Case_Label_Allow_Or_Not_Check {
    public static void main(String[] args) {
        int x = 10;
        switch (x)
        {
            case 10:
                System.out.println(x);
                break;
            case 98:
                System.out.println();
                break;
            case 99:
                System.out.println(99);

            //case 'a'://Duplicate case label
                System.out.println(97.0);
        }
    }
}
