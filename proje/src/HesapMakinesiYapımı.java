import java.util.Scanner;

public class HesapMakinesiYap�m� {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int sayi1,sayi2,secim;
	System.out.print("�lk Say�y� Giriniz: ");
	sayi1 = scan.nextInt();
	System.out.println("\n�kinci Say�y� Giriniz: ");
	sayi2 = scan.nextInt();
	System.out.println("\nYapmak �stedi�iniz ��lemi Se�iniz: ");
	System.out.println("1- Toplama\n2- ��karma\n3- �arpma\n4- B�lme");
	System.out.println("Se�iminiz:");
	secim = scan.nextInt();
	
	if(secim==1) {
		System.out.println("Toplama: " + (sayi1 + sayi2));
	}
	else if(secim==2) {
		System.out.println("��karma: " + (sayi1 - sayi2));
	}
	
	else if (secim==3) {
		System.out.println("�arpma: " + (sayi1 * sayi2));
	}
	else if (secim==4) {
		if (sayi2==0) {
			System.out.println("�kinci Say� 0'a E�ittir Ve Sonu� Belirsizdir");
		}else {
			System.out.println("B�lme: " + (sayi1/sayi2));
		}
	}else {
		System.out.print("Ge�ersiz bir i�lem girdiniz tekrar deneyiniz ");
	}
			
			
	
	
	
	
	
	
	
	
		
		
		
		
	}

}
