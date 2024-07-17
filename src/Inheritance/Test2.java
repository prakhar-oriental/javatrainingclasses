package Inheritance;

public interface Test2 {
	public  void m1();
	 public static void m2()
	 {
		 System.out.println("m2 2");
	 }
     default void show()
     {
   	  System.out.println("default 2");
     }
}
