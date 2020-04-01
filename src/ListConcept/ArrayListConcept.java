package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		//dynamic-Arraylist
		ArrayList ar=new ArrayList();//this is non genereics bz i can give any type of data 
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		ar.add(40);
		ar.add(50);
		ar.add("Kalyani");
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		//print all elements in ArrayList-1.using for loop
		for(int i=0;i<ar.size();i++) {
			System.out.println("Elements in the arraylist are " +ar.get(i));
		}
		//Generics-type specific
		ArrayList<Integer> ar1=new ArrayList<>();
	//	ar1.add("String");
		ar1.add(10);
//2.Using Iterator
		//Employee class object
		Employee e1=new Employee("Kalyani",26,"Liberal Study");
		Employee e2=new Employee("Ashna",18,"Liberal Art");
		Employee e3=new Employee("Shubhya",23,"LLB");
		//crreate arraylist
		ArrayList<Employee> employ=new ArrayList<>();
		employ.add(e1);
		employ.add(e2);
		employ.add(e3);
		//Iterator to traverse the values
		Iterator<Employee> it= employ.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		System.out.println("**************addALL***********");
	ArrayList ar5= new ArrayList();
	ar5.add("Radha");
	ar5.add(23);
	ar5.add("Bawri");
	ArrayList ar6= new ArrayList();
	ar6.add("Hi");
	ar6.add("nayan");
	ar5.addAll(ar6);
	for(int i=0;i<ar5.size();i++){
		System.out.println(ar5.get(i));
	}
	System.out.println("********removeAll*******");
	ar5.removeAll(ar6);
	for(int i=0;i<ar5.size();i++){
		System.out.println(ar5.get(i));
	}
	System.out.println("********retainAll*******");
	ArrayList ar7=new ArrayList();
	ar7.add("a");
	ar7.add("b");
	ar7.add("c");
	ArrayList ar8= new ArrayList();
	ar8.add("a");
	ar8.add("b");
	ar.add("x");
	ar7.retainAll(ar8);
	System.out.println(ar7);
	for(int i=0;i<ar7.size();i++){
		System.out.println(ar7.get(i));
	}
	
		
	}

}
