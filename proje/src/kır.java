import java.util.Scanner;

public class kýr {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String k_adi,parola;
	System.out.print("Kullanýcý Adýný Giriniz: ");
	k_adi = scan.next();
	System.out.print("Parola Giriniz: ");
	parola = scan.next();
	if (k_adi.equals("java") && parola.equals("123")){
		System.out.print("Baþarýlý Bir Þekilde Giriþ Yaptýnýz ");
	}else {
		System.out.print("Kullanýcý adýnýz veya parolanýz yanlýþ");
	}
			
		
		
		
		
		
		
		
		
		
		

	}

}
