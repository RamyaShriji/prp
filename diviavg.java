import java.util.*;
class diviavg
{
    public static void main(String args[])
    {
        int a[]=new int[args.length];
        for(int i=0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(args[i]);
        }
        ArrayList<Integer>al=new ArrayList<Integer>();
        ArrayList<Integer>al1=new ArrayList<Integer>();
        int sum=0,sum1=0,avg=0,avg1=0;
        for(int i=0;i<a.length-1;i++)
        {
            al.add(a[i]);
            for(int j=i+1;j<a.length;j++)
            {
                al1.add(a[j]);
            }
            for(int k=0;k<al.size();k++)
            {
                sum=sum+al.get(k);
            }
            avg=sum/al.size();
            for(int k1=0;k1<al1.size();k1++)
            {
                sum1=sum1+al1.get(k1);
            }
            avg1=sum1/al1.size();
            if(avg==avg1)
            {
                System.out.print(al);
                System.out.print(al1);
                break;
            }
            if(al.size()==a.length-1)
            {
                System.out.print("Invalid Input");
            }
            al1.clear();
            sum=0;
            avg=0;
            sum1=0;
            avg1=0;
        }
    }
}

