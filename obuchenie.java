package obuchenie;

import java.util.Scanner;

public class obuchenie {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("----явл€етс€ ли год високосным?----");
	    System.out.print("¬ведите год: ");
	    int year = in.nextInt();
	    if (year % 4 == 0 && year>0) {
	    	System.out.println(year + "-й год €вл€етс€ вискосным");
	    } else if (year % 4 != 0 && year > 0 ) {
	    	System.out.println(year + "-й год Ќ≈ €вл€етс€ вискосным");
	    } else {
	    	System.out.println("¬веден некорректный год");
	    }
	}

}
