import java.util.Scanner;

public class Notortalamas� {

	public static void main(String[] args) {
		
	int turkce,matematik,fenBilgisi,sosyalBilgisi,bedenE�itimi;
	double ortalama = 0;
	Scanner scan = new Scanner(System.in);
	System.out.print("T�rk�e notunu giriniz: ");
	turkce = scan.nextInt();
	System.out.print("\nFen Bilgisi notonu giriniz: ");
	fenBilgisi = scan.nextInt();
	System.out.print("\nMatematik notunu giriniz: ");
	matematik = scan.nextInt();
	System.out.print("\nSosyal Bilgisi notounu giriniz: ");
	sosyalBilgisi = scan.nextInt();
	System.out.print("\nBeden E�itimi notunu giriniz: ");
	bedenE�itimi = scan.nextInt();
	ortalama = (turkce+matematik+fenBilgisi+sosyalBilgisi+bedenE�itimi) / 5;
	if (ortalama<50) {
		System.out.println("S�n�fta Kald�n�z");
	  
	}else {
		System.out.println("S�n�f� Ge�tiniz");
	}
	
	 System.out.println("S�n�f Ortalaman�z: " +  ortalama);
		
		
		
		
		
		
		
		
		
		
		
	}

}
