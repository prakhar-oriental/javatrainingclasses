package Inheritance;

public interface Test1 {
	 public  void m1();
	 public static void m2()
	 {
		 System.out.println("m2 1");
	 }
      default void show()
      {
    	  System.out.println("default 1");
      }
}
