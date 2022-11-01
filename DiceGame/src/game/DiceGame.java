package game;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	private int comp;
	private int user;

	public DiceGame() {
		super();
		this.comp = 0;
		this.user = 0;

	}

	public int getComp() {
		return comp;
	}

	public void setComp(int comp) {
		this.comp = comp;
	}

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	public int rollDice() {
		Random r = new Random();
		int num = r.nextInt(1, 7);
		return num;
	}
	
	public void giveResult(int u, int c, String name) {
		
		if(u>c) {
			System.out.println(name+" Wins");
			int uval = getUser();
			uval++;
			setUser(uval);
			
		
		 } else if(c>u) {
			 System.out.println("Computer wins");
			int cval = getComp();
			cval++;
			setComp(cval);
			
		} else {
			System.out.println("Its Tie");
		}
		
	}

	public void start(String name) throws IOException {
		

		for (int i = 1; i <= 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Round "+i);
			System.out.println(", Press Enter to play");
			sc.nextLine();
			System.out.print("Its "+name+"'s Turn ");
			int uturn = rollDice();
			System.out.println(" => Its " + uturn);
			
			System.out.print("Its computer turn, ");
			int cturn = rollDice();
			System.out.println("=> Its " + cturn);
			
			giveResult(uturn, cturn, name);
			
			System.out.println(name+"  = "+ getUser() +"\t\tComputer = "+getComp());
			
			System.out.println("====================================\n");
		}

	}
}
