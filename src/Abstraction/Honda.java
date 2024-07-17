package Abstraction;

public class Honda extends Car {

	public Honda(String engn) {
		super(engn);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Car c = new Honda("honda");
          System.out.println(c);
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Honk() {
		// TODO Auto-generated method stub
		
	}

}
