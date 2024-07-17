package Abstraction;

public abstract class Car {
    String engn;
	public abstract void accelerate();
	public abstract void Honk();
	public  void wheel()
	{
	  System.out.println("It has four wheel");
	}
	
	@Override
	public String toString() {
		return "Car [engn=" + engn + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	}
	public Car(String engn) {
		super();
		this.engn = engn;
	}

}
