import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
	
	/*	ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		
		for(Integer obj : a) {
			System.out.println(obj.doubleValue());
			
		}
		
		HashMap<Integer , String> c = new HashMap<>();
		c.put(1,"Adana");
		c.put(6,"Ankara");
		c.put(34,"Ýstanbul");
		
		for(Integer key : c.keySet()) {
			System.out.println("Key : " + key + " - Value : " + c.get(key));
		}
		
		for(String value : c.values()) {
			System.out.println(value);
		}
		
		*/
		
		
		Test2<Integer , String> i = new Test2<>(1, "Adana");
		i.print();
		
		
		
		
	Integer[] intArr = {1,2,3,4};
	Double[] doubleArr = {1.1,2.1,3.1};
	Character[] charArr = {'K' , 'O' , 'D'};
	
	genericMetod(intArr);
	genericMetod(doubleArr);
	genericMetod(charArr);
	
		
		
		}

		public static <E> void genericMetod(E[] arr) {
			for(E item : arr) {
				System.out.println(item);
			}
		}
	
	
	
	
	
	
	
	
	}
