package oopsconcept;

public class TestCar {

	public static void main(String[] args) {
		//compile time polymorphism or static polymorphism bz at the tym of compilation java will decide which method to call
		//polymorphism-one to many-overriding
		BMW b=new BMW();
		b.start();
		b.stop();
		b.theftSafety();
		b.refuel();
		b.engine();
		
		System.out.println("*************************");
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		//c.theftSafety(); parent cannot have access to inherit the properties of child class safety issue
		System.out.println("*************************");
		
		//Top casting-movins small thing into big
		Car a= new BMW();//when the child class object is referred by parent class reference variable is called dynamic or runtime polymorphism.
		a.start();
		a.stop();
		a.refuel();
		//a.theftSafety();
		//down casting-moving big thing into small
		//parent class object referred by child class object reference-is not allowed
		BMW d= (BMW)new Car();//casting it gives ClassCastException
		
	}

}
