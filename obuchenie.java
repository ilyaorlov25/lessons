package obuchenie;

import java.util.Scanner;

public class obuchenie {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("----�������� �� ��� ����������?----");
	    System.out.print("������� ���: ");
	    int year = in.nextInt();
	    if (year % 4 == 0 && year>0) {
	    	System.out.println(year + "-� ��� �������� ���������");
	    } else if (year % 4 != 0 && year > 0 ) {
	    	System.out.println(year + "-� ��� �� �������� ���������");
	    } else {
	    	System.out.println("������ ������������ ���");
	    }
	}

}
