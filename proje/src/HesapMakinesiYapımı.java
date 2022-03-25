import java.util.Scanner;

public class HesapMakinesiYapýmý {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int sayi1,sayi2,secim;
	System.out.print("Ýlk Sayýyý Giriniz: ");
	sayi1 = scan.nextInt();
	System.out.println("\nÝkinci Sayýyý Giriniz: ");
	sayi2 = scan.nextInt();
	System.out.println("\nYapmak Ýstediðiniz Ýþlemi Seçiniz: ");
	System.out.println("1- Toplama\n2- Çýkarma\n3- Çarpma\n4- Bölme");
	System.out.println("Seçiminiz:");
	secim = scan.nextInt();
	
	if(secim==1) {
		System.out.println("Toplama: " + (sayi1 + sayi2));
	}
	else if(secim==2) {
		System.out.println("Çýkarma: " + (sayi1 - sayi2));
	}
	
	else if (secim==3) {
		System.out.println("Çarpma: " + (sayi1 * sayi2));
	}
	else if (secim==4) {
		if (sayi2==0) {
			System.out.println("Ýkinci Sayý 0'a Eþittir Ve Sonuç Belirsizdir");
		}else {
			System.out.println("Bölme: " + (sayi1/sayi2));
		}
	}else {
		System.out.print("Geçersiz bir iþlem girdiniz tekrar deneyiniz ");
	}
			
			
	
	
	
	
	
	
	
	
		
		
		
		
	}

}
