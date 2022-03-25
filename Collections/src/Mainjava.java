import java.util.*;
public class Mainjava {

	public static void main(String[] args) {
	    // ArrayList<E>
		// LinkedList<E>
		// Vector<E>
		
		
	/*	ArrayList country = new ArrayList();
		country.add("Ankara");
		country.add("Siirt");
		country.add("Bolu");
		country.add("Ankara");
		
		country.add("Ýstanbul");
		country.remove(1);
		
		Iterator itr = country.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
          
		country.forEach(i -> System.out.println(i));  */
	
	
	
	LinkedList list = new LinkedList();
	
	list.add("Armut");
	list.add("Çilek");
	list.add("Kavun");
	
	list.add(1,"Karpuz");
	
	list.forEach(i -> System.out.println(i));
	
	
	
	Vector v = new Vector(4,2);
	v.add("Armut");
	v.add("Kiraz");
	v.add("Çilek");
	v.add("Kavun");
	v.add("Karpuz");
	v.add("Elma");
	v.add("Elma");
	v.add("Elma");
	v.add("Elma");
	v.add("Elma");
	v.add("Elma");
	v.add("Elma");
	
	
	System.out.println("Boyut : " + v.size());
	System.out.println("Kapasitesi : " + v.capacity());
	
	v.remove(0);
	System.out.print(v.firstElement());
	
	
	
	
	
	
	
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
