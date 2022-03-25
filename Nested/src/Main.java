
public class Main {

	public static void main(String[] args) {
		
		// Nested Class (�� ��e S�n�flar)
		// -Inner Class (�� S�n�flar)
		//    -Static
		//    -Non-Static
		// - Local Class (Yerel S�n�flar)
		// - Anonymous Class (Anonim S�n�flar)
		
		
		NonStatic n = new NonStatic();
		NonStatic.Inner inner = n.new Inner ();
		//inner.run();
		
		Static.Inner s = new Static.Inner();
		//s.run();
		
		Local l = new Local();
		//l.run();
		
		Anonim a = new Anonim() {
			public void run() {
				System.out.println("Anonim s�n�fa ait run metodu ");
			}
			
			public void print() {
				System.out.println("print ");
			}
			
		};
		
		
		a.run();
		a.print();
		
		
		

	}

}
