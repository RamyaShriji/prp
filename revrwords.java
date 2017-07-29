import java.util.*;
public class revrwords
{

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedList<String> ll=new LinkedList<String>();
	String s=sc.nextLine();
	ll.add(s);
	String s1=sc.nextLine();
	ll.add(s1);
    Iterator itr=ll.descendingIterator();
    while(itr.hasNext())
    {
    	System.out.print(itr.next()+" ");
    }
    
	}

}
