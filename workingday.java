import java.util.*;
class workingday
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String a[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        if(str.equals(a[0]))
        {
            System.out.print("False");
        }
        else
        {
            System.out.print("True");
        }
    }
}
