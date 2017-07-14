import java.util.*;
class panagram
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String str=st.toLowerCase();
        ArrayList<Character> al=new ArrayList<Character>();
        for(int i=0;i<str.length();i++)
        {
            al.add(str.charAt(i));
        }
        ArrayList<Character> al1=new ArrayList<Character>();
        for(char i='a';i<='z';i++)
        {
            al1.add(i);
        }
      
        if(al.containsAll(al1))
        {
        System.out.print("panagram");
        }
        else
        {
        System.out.print("not a panagram");
        }
    }
}

