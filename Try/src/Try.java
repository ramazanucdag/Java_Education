
public class Try {

	public static void main(String[] args) {
	
		
		System.out.println("Program Ba?lad? ");
	
		
		/* 
		  int a = 0;
		 
	try {
		 a = 2/0; // Hata yakalad?k
		 System.out.println("Try i?erisinde ");
			System.out.println(a);
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
		
	}	
		*/
		int[] arr = new int [3];
		try {
			arr[4] = 10;
		}catch (ArryIndexOutOfBoundsException e ) {
			System.out.println(e.toString());
			
		}
		System.out.println("Program Bitti ");
		
		
	}

}
