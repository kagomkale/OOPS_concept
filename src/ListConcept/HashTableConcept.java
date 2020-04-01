package ListConcept;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
	Hashtable h=new Hashtable();
	h.put("A", "Raja");
	h.put("B", "Kaleja");
	h.put("C", "Samaja");
	System.out.println(h.size());
	h.put(1,"o raja");
	h.put(2,10);
	System.out.println(h.size());
	System.out.println(h.get(1));
	System.out.println(h.get("C"));

	}

}
