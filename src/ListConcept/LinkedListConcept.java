package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> li=new LinkedList<>();
		li.add("test");
		li.add("Selenium");
		li.add("QTP");
		//print
		System.out.println("Content of linkedlist :"+li);
		//add
		li.addFirst("First");
		li.addLast("end");
		System.out.println("Content of linkedlist :"+li);
		//get the vale
		System.out.println(li.get(0));
		//set the value
		li.set(0, "NewFirstValue");
		System.out.println(li.get(0));
		//remove first and last element
li.removeFirst();
li.removeLast();
System.out.println(li);
li.remove(2);
System.out.println(li);
//How to print all thevalues of LinkedList
//for loop
//advanced for loop
//while
//iterator
System.out.println("Using for loop");
for(int i=0;i<li.size();i++) {
	System.out.println(li.get(i));
}
System.out.println("Enhance for loop");
for(String ll:li) {
	System.out.println(ll);
}
System.out.println("Using Iterator");
Iterator <String>it=li.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
System.out.println("Using while loop");
int num=0;
while(li.size()>num) {
	System.out.println(li.get(num));
	num++;
}
	}

}
