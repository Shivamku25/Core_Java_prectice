package Variable;

public class Var_Arg_Method {
    public static void m1(int...x)
    {
        System.out.println("var_arg method");
    }

    public static void main(String[] args) {
        m1();
        m1(10);
        m1(10,20,30);
        m1(10,20,30,40);


    }
}
