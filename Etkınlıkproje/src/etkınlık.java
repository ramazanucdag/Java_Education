import java.util.Scanner;

public class etk�nl�k {

	public static void main(String[] args) {
	
	      //hava s��akl���n� al
		 //s�cakl�k 30 veya daha y�ksekse y�zme etkinli�ini �ner
		//5 ve 30 atas�nda ise sinema �ner
		//4 ve daha az ise kayak yapmay� �ner   
 
		Scanner scan = new Scanner(System.in);	
		
	int sicaklik;
	System.out.print("Hava S��akl���n� Giriniz: ");
	sicaklik = scan.nextInt();
	
	if (sicaklik > 30) {
		System.out.println("Bu Havada Y�zmeye Gidilir");
	}else if (sicaklik <=30 && sicaklik >= 5 ) {
		System.out.print("Bu havada en iyi sinemaya gidilir");
	}else {
		System.out.print("Bu havada en iyi kaya�a gidilir");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
