import java.io.*;
import java.util.*;
class square
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[4];
        int b[]=new int[4];
        for(int i=0;i<4;i++)
        {
            a[i]=s.nextInt();
            b[i]=s.nextInt();
        }
        if((a[0]==a[3])&&(a[1]==a[2])&&(b[0]==b[1])&&(b[2]==b[3]))
        {
            System.out.print("Squ");
        }
        else
        {
            System.out.print("Not a Squ");
        }
    }
}

