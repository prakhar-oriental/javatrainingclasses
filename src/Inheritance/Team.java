package Inheritance;

public class Team extends Teamlead{
   public  String teamname;
   public  String projectname;
   public int noemp;
   
	


	@Override
public String toString() {
	return "Team [teamname=" + teamname + ", projectname=" + projectname + ", noemp=" + noemp + ", pid=" + pid
			+ ", pname=" + pname + ", empid=" + empid + "]";
}

	public Team(String teamname, String projectname, int noemp, int pid, String pname, String empid) {
	super(pid,pname , empid);
	this.teamname = teamname;
	this.projectname = projectname;
	this.noemp = noemp;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Team t = new Team("okl","p1",23,34,"fhb","45");
           
           System.out.println(t);
	}

}
