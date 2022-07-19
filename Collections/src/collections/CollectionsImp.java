package collections;
import java.util.*;
public class CollectionsImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ArrayList");
		ArrayList <String> c=new ArrayList<String>(); 
		c.add("Madurai");
		c.add("Chennai");
		System.out.println(c);
		
		System.out.println("Vector");
		Vector <Integer> v=new Vector<Integer>();
		v.add(110);
		v.add(420);
		v.add(10);
		System.out.println(v);
		
		System.out.println("LinkedList");
		LinkedList <String>ll=new LinkedList<String>();
		ll.add("Gopalakrishnan");
		ll.add("Gopi");
		Iterator<String> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("HashSet");
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(50);
		h.add(780);
		h.add(10);
		h.add(1);
		System.out.println(h);
	
		System.out.println("LinkedHashSet");
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(450);
		lhs.add(10);
		lhs.add(0);
		lhs.add(40);
		System.out.println(lhs);
	}

}
