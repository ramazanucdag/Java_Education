
public class Main {

	public static void main(String[] args) {
		
		Islemler i1 = new Islemler("Ýlk");
		Thread t1 = new Thread(i1);
		
		Islemler i2 = new Islemler("Ýlk");
		Thread t2 = new Thread(i2);
		
		t1.start();
		t2.start();

	}

}
