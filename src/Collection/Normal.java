package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Normal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        ArrayList<Player> al = new ArrayList();
        for(int i = 0;i<1;i++)
        {
        	System.out.println("Enter playername");
        	String playername = sc.nextLine();
        	System.out.println("Enter playerid");
        	int playerid = sc.nextInt();sc.nextLine();
        	System.out.println("Enter skill");
        	String skill = sc.nextLine();
        	System.out.println("Enter country");
            String country = sc.nextLine();
            Player p = new Player(playername,playerid,skill,country);
            al.add(p);
            
        }
        for(Player x : al)
        {
        	System.out.println(x);
        }
        System.out.println("Enter player skill");
        String sk = sc.nextLine();
        for(int i = 0;i<al.size();i++)
        {
        	if(al.get(i).skill.equals(sk))
        	{
        		System.out.println("Playername with above skill is"+al.get(i).playername);
        		break;
        	}
        }
	}

}
