package Flow_Control;

public class For_Loop_To_Print_Reverse_Order_Array {
    public static void main(String[] args) {
        int[] x = {10,20,30,40,50};
        for(int i =x.length-1;i>=0;i--)
        {
            System.out.println(x[i]);
        }
    }
}
