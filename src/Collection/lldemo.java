package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class lldemo {
  public static void main(String args[])
  {
	  LinkedList<String> ll = new LinkedList<>();
	  ll.add("sdvu");
	  ll.add("ghvu");
	  ll.add("sdki");
	  ll.add("svbu");
	  System.out.println(ll);
	  
	  ArrayList<String> al = new ArrayList<>();
	  al.add("sbnu");
	  al.add("gdyu");
	  al.add("smki");
	  al.add("sxsu");
	  System.out.println(al);
	  ll.addAll(al);
	  
	  ll.add(2, "x");
	  System.out.println(ll);
	  System.out.println(ll.get(1));
	  if(ll.contains("x"))
	  {
		int a = ll.indexOf("x");  
	    ll.remove(a);
		System.out.println(ll);
	  }
  }
}
