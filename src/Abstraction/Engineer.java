package Abstraction;

public class Engineer extends Employee {

   public Engineer(String name,int id)
   {
	super(name,id);   
   }
   public static void main(String args[])
   {
	   Employee a = new Engineer("uhv",45);
   }
}
