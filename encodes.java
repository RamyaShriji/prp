import java.io.*;
import java.util.*;
class encodes
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.next().toLowerCase();
        String s2=s.next().toLowerCase();
        int a;
        ArrayList<Character>al=new ArrayList<Character>();
        for(int i=0;i<s1.length();i++)
        {
            a=(int)s1.charAt(i)+10;
            if(a>122)
            a=(a-122)+96;
            al.add((char)a);
            System.out.print(al.get(i));
            a=0;
        }
        al.clear();
        System.out.print(" ");
        for(int i=0;i<s2.length();i++)
        {
            if(i!=0&&i!=s2.length()-1)
            {
                a=(int)s2.charAt(i)+10;
                if(a>122)
                a=(a-122)+96;
                al.add((char)a);
            }
            else
            {
                al.add(s2.charAt(i));
            }
            System.out.print(al.get(i));
            a=0;
        }
    }
}
