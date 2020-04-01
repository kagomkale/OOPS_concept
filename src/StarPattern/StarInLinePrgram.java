package StarPattern;

import java.util.Scanner;

public class StarInLinePrgram {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no.of rows needed to print on screen");
		int row=scanner.nextInt();
		System.out.println("No.of rows " +row);
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

}
