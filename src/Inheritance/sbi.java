package Inheritance;

public class sbi extends Pmanager{
	public String name;
	public double roi;
	public sbi(String pmname, int nop,String name,double roi) {
		super(pmname, nop);
		this.name = name;
		this.roi = roi;
		// TODO Auto-generated constructor stub
	}
	public  void displayroi()
    {
    	System.out.println("roi : "+roi);
    }
	@Override
	public String toString() {
		return "axis [name=" + name + ", roi=" + roi + ", pmname=" + pmname + ", nop=" + nop + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
