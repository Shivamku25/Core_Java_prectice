package Operator_Assignments;

public class Sort_Ciruit_Operator {
    public static void main(String[] args) {
        int x=10,y=15;
        if (++x<10 & ++y>15)
        {
            x++;
        }
        else
        {
            y++;
        }
        System.out.println(x+y);
        System.out.println(x);
        System.out.println(y);
    }
}
