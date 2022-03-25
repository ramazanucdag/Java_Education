import java.util.Scanner;

public class etkýnlýk {

	public static void main(String[] args) {
	
	      //hava sýçaklýðýný al
		 //sýcaklýk 30 veya daha yüksekse yüzme etkinliðini öner
		//5 ve 30 atasýnda ise sinema öner
		//4 ve daha az ise kayak yapmayý öner   
 
		Scanner scan = new Scanner(System.in);	
		
	int sicaklik;
	System.out.print("Hava Sýçaklýðýný Giriniz: ");
	sicaklik = scan.nextInt();
	
	if (sicaklik > 30) {
		System.out.println("Bu Havada Yüzmeye Gidilir");
	}else if (sicaklik <=30 && sicaklik >= 5 ) {
		System.out.print("Bu havada en iyi sinemaya gidilir");
	}else {
		System.out.print("Bu havada en iyi kayaða gidilir");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
