package programming;

public class FactorialOfNumber {
//without recursion - using loop
	public static int Fact(int num) {
		int fact=1;
		if(num==0)
			return 1;
	    for(int i=1;i<=num;i++) {
		fact=fact*i;
	    }
	    return fact;
	}
	//with recursion- when a function call itself
	public static int Facto(int num) {
		if(num==0)
			return 1;
		else
		    return (num*Facto(num-1));
	}
	public static void main(String[] args) {
		System.out.println(Fact(0));
		System.out.println(Fact(5));
	    System.out.println(Fact(8));
System.out.println(Facto(4));
	}

}
