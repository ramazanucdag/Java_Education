import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		
	int quiz , vize , sonsinav;
	double ortalama;
	Scanner input = new Scanner(System.in);
	
	
	System.out.print("Vize Notunu Giriniz: ");
	vize = input.nextInt();
	System.out.print("SonSinav Notunu Giriniz: ");
	sonsinav = input.nextInt();
	
     ortalama = (vize * 0.4) + (sonsinav * 0.6);
     System.out.println("Not Ortalaman�z: " + ortalama);
     String sonuc = (ortalama >= 50) ? "Ge�tiniz" : "Kald�n�z";
     System.out.println(sonuc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
