import java.util.*;
public class substr {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		HashSet<Character> h=new HashSet<Character>();
		HashSet<String> h1=new HashSet<String>();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String s1=s.substring(i, j+1);
				char[] c=s1.toCharArray();
				for(int k=0;k<c.length;k++)
				{
					h.add(c[k]);
				}
				if(s1.length()==h.size())
				{
					h1.add(s1);
					al1.add(s1.length());
				}
				h.clear();	
				
			}
		}
		Collections.sort(al1);
		for(String z:h1)
		{
			if(z.length()==(int)al1.get(al1.size()-1))
			{
				System.out.println(z);
			}
		}
	}
}
