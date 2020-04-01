package programming;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int temp;
		System.out.println("Before swapping x: " +x+ "and Y is: "+y);
		//Swapping using third variable
		temp=x;//temp=10
		x=y;//x=20
		y=temp;
		System.out.println("After swapping the value of x is: " +x+ "and y is: " +y  );
//swapping without usinh thiird var
		System.out.println("Before swapping x: " +x+ "and Y is: "+y);
		x=x+y;//x=30
		y=x-y;//y=10
		x=x-y;//x=20
		System.out.println("After swapping the value of x is: " +x+ "and y is: " +y  );
	}

}
