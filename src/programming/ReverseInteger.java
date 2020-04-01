package programming;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		int RevNum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a original number");
		int num=sc.nextInt();
		while(num!=0) {
		//	RevNum=RevNum+num%10;
			RevNum=RevNum*10+num%10;
		//	RevNum=RevNum*100;
			num=num/10;
		}
System.out.println(RevNum);
	}

}
