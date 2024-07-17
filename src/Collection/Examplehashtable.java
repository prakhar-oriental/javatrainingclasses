package Collection;


import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Examplehashtable {
	public static void main(String args[])
	{
   ArrayList<String> al = new ArrayList();
   al.add("maruti");
   al.add("baleno");
   al.add("Audi");
   al.add("Audi");
   Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
   ht.put(1, "one");
   ht.put(2, "two");
   ht.put(3, "three");
  // ht.put(4, "three");
    
//   System.out.println(ht.getOrDefault(4,"not avail"));
//   System.out.println(ht.putIfAbsent(2, "hii"));
//   System.out.println(ht.putIfAbsent(5, "hii"));
//   System.out.println(ht.get(5));
//   System.out.println(ht.getOrDefault(5,"not avail"));
   Enumeration<Integer> en = ht.keys();
   while(en.hasMoreElements())
   {
	   System.out.println(en.nextElement());
   }
   Set<Entry<Integer, String>>s = ht.entrySet();
   for(Entry<Integer,String> x : s)
   {
	   System.out.println(x.getKey()+"  "+x.getValue());
   }
	}
}
