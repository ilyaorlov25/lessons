package obuchenie;

import java.util.Scanner;

public class obuchenie {
	public static void main(String args[]) { 
		Scanner scan = new Scanner (System.in); 
		mathActions maths = new mathActions();
		System.out.print("������� ��� �����: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		maths.plus(a,b);
		maths.minus(a,b);
		maths.multiply(a, b);
		maths.divide(a, b);
		maths.factorial(a);
		maths.stepen(a, b);
		maths.sinus(a);
		maths.cosinus(a);
		} 
}
class mathActions { 
	public void plus(int a, int b) {
		System.out.println("����� " + a + " � " + b + ": " + (a+b));
	}
	public void minus(int a, int b) {
		System.out.println("�������� " + a + " � " + b + ": " + (a-b));
	}
	public void multiply(int a, int b) {
		System.out.println("������������ " + a + " � " + b + ": " + (a*b));
	}
	public void divide(int a, int b) {
		double chastnoe = a/b;
		System.out.println("������� " + a + " � " + b + ": " + chastnoe);
	}
	public void stepen(int a, int b) {
		int i;
		int c=1;
		if (b==0) {
			System.out.println(a + " � ������� ������� ����� ����");
		} else if (b==1) {
			System.out.println(a + " � ������ ������� ����� " + a);
		} else {
			for (i=1; i<=b; i++) {
				c = c*a;
			}
			System.out.println(a + " � " + b + "-� ������� ����� " + c);
		}
	}
	public void factorial(int a) {
		long factorial = 1; 
		for (int i=2; i<(a+1); i++) { 
		factorial=factorial*i; 
		} 
		System.out.println("��������� " + a + " ����� " + factorial); 
		} 
	public void sinus(int a) {
		System.out.println("����� " + a + " ����� " + Math.sin(a) + " ������"); 
	}
	public void cosinus(int a) {
		System.out.println("������� " + a + " ����� " + Math.cos(a) + " ������"); 
	}
}