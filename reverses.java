import java.util.*;
class reverses
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2="";
        StringBuffer sb=new StringBuffer(s1);
        s2=sb.reverse().toString();
        if(s2.equals(s1))
        {
            System.out.print("reverse");
        }
        else
        {
            System.out.print("not reverse");
        }
    }
}



