package Exception;

import java.util.Scanner;

class Votingex extends Exception{

	static String nv = "You are under age for casting the vote";
	 public Votingex() {
		 super(nv);
	 }
	
}
 public class Voting
 {
	 public static void main(String args[]) throws Votingex
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter your age");
	 int n = sc.nextInt();
	 if(n<18)
		 throw new Votingex();
		//  System.out.println(new Votingex().getMessage());
	 else
		 System.out.println("You are eligible for casting vote");
	 }
 }
