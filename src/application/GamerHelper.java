package application;

import java.util.Scanner;

public class GamerHelper {
	
	public int getUserInput(String prompt) {
		System.out.println(prompt + " ");
		Scanner sc = new Scanner (System.in);
		return sc.nextInt();
	}

}
