package Flow_Control;

public class Break_Statement_Use_Inside_Labeled_Block {
    public static void main(String[] args) {
        int x=10;
        l1:
        {
            System.out.println("Begin");
            if (x==10)
                break l1;
            System.out.println("end");
        }
        System.out.println("Hello");
    }
}
