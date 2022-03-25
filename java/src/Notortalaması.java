import java.util.Scanner;

public class Notortalamasý {

	public static void main(String[] args) {
		
	int turkce,matematik,fenBilgisi,sosyalBilgisi,bedenEðitimi;
	double ortalama = 0;
	Scanner scan = new Scanner(System.in);
	System.out.print("Türkçe notunu giriniz: ");
	turkce = scan.nextInt();
	System.out.print("\nFen Bilgisi notonu giriniz: ");
	fenBilgisi = scan.nextInt();
	System.out.print("\nMatematik notunu giriniz: ");
	matematik = scan.nextInt();
	System.out.print("\nSosyal Bilgisi notounu giriniz: ");
	sosyalBilgisi = scan.nextInt();
	System.out.print("\nBeden Eðitimi notunu giriniz: ");
	bedenEðitimi = scan.nextInt();
	ortalama = (turkce+matematik+fenBilgisi+sosyalBilgisi+bedenEðitimi) / 5;
	if (ortalama<50) {
		System.out.println("Sýnýfta Kaldýnýz");
	  
	}else {
		System.out.println("Sýnýfý Geçtiniz");
	}
	
	 System.out.println("Sýnýf Ortalamanýz: " +  ortalama);
		
		
		
		
		
		
		
		
		
		
		
	}

}
