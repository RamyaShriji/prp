import java.util.*;
class palin
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t,count=0;
        String ss="";
        while(n>0)
        {
            t=n%10;
            count=count+t;
            n=n/10;
        }
        String ss1=Integer.toString(count);
        StringBuffer sb=new StringBuffer(ss1);
        ss=sb.reverse().toString();
        if(ss.equals(ss1))
        {
            System.out.print("palindrome");
        }
        else
        {
            System.out.print("not a palindrome");
        }
        
        
    }
}

