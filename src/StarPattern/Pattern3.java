package StarPattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("No.of rows");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int k=row;k>=i;k--) {
				System.out.print("* ");
			}
			for(int j=1;j<=row;j++) {
				System.out.print(" ");
			}
			System.out.println("");
		} 
	}

}
