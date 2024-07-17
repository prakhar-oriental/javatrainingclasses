package Inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("which bank do you want to visit");
		System.out.println("1 : sbi");
		System.out.println("2 : axis");
		System.out.println("3 : citi");
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n)
		{
		case 1 :{
;		axis a = new axis("Ravi",5,"Axis",4.5);
        System.out.println(a);
        a.displayroi();
        break;
		}
		case 2:{
        citi b = new citi("Ravi",5,"citi",7.5);
        System.out.println(b);
        b.displayroi();
        break;
		}
		case 3 :{
        sbi c = new sbi("Ravi",5,"sbi",9.5);
        System.out.println(c);
        c.displayroi();
        break;
		}
		default :
			System.out.println("you entered wrong choice");
		}
	}

}
