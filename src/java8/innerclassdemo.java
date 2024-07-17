package java8;

class cpu
{
public	double price;

class processor
{
public	double cores;
public  String manufacture;

double getcatche()
{
	return 5.3;
}
}
protected class ram{
	double memory;
	String manufacture;
	double getclockspeed()
	{
		return 5.6;
	}
}

}
public class innerclassdemo {
    public static void main(String args[]) {
    	cpu c= new cpu();
         cpu.processor p = c.new processor();
         System.out.println(p.getcatche());
    }
}
