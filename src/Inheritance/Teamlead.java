package Inheritance;

public class Teamlead {
  public int pid;
  public String pname;
  public String empid;
public Teamlead(int pid, String pname, String empid) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.empid = empid;
}

@Override
public String toString() {
	return "Teamlead [pid=" + pid + ", pname=" + pname + ", empid=" + empid + "]";
}

public void display()
{
	System.out.println("project");
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getEmpid() {
	return empid;
}
public void setEmpid(String empid) {
	this.empid = empid;
}
  
}

