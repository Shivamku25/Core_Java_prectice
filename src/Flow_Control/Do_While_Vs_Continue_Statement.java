package Flow_Control;

public class Do_While_Vs_Continue_Statement {
    public static void main(String[] args) {
        int x = 0;
        do {
            x++;
            System.out.println(x);
            if (++x<5)
            {
                continue;
            }
            x++;
            System.out.println(x);
        }
        while (++x<10);
    }
}
