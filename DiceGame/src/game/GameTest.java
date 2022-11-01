package game;

import java.io.IOException;
import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");

		String uName = sc.nextLine();
		
		
		DiceGame dg = new DiceGame();
		dg.start(uName);
		
		System.out.println("======= ****   Overall Result **** =======");
		dg.giveResult(dg.getUser(), dg.getComp(), uName);
		
	}

}
