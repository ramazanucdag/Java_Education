import java.util.Scanner;

public class asalsayilar {

	public static void main(String[] args) {

   Scanner scan = new Scanner(System.in);
  int input;
   boolean asal = true;
  do {
	  System.out.print("L�tfen pozitif say� giriniz: "); 
	  input = scan.nextInt();
   }while(input < 2);
   for(int i=2; i<input; i++) { 
	   if(input%i==0) {
		asal = false;
		break;
		
	   }
   }
   
   if(asal) {
	   System.out.println("Girilen say�: " + input + " asald�r.");
   }else {
	   System.out.println("Girilen say�: " + input + " asal de�ildir.");
   }












		
	}

}
