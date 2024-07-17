package Inheritance;

public class hv implements Test1,Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      hv f = new hv();
      Test1.m2();
      Test2.m2();
      f.m1();
      f.show();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("abs");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		Test2.super.show();
	}

}
