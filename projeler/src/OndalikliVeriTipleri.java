public class OndalikliVeriTipleri {

	public static void main(String[] args) {
		
    float abc = 32.5f;
	
    //System.out.println(abc);
    
    double sayi = 35;
		
		//System.out.println(sayi);
		
		char karakter = 117;
		char karakter2 = 'u';
		//System.out.println(karakter);
		//System.out.println(karakter2);
		
		
		
		boolean mantik = true;
		boolean mantik2 = false;
		//System.out.println(mantik);
		//System.out.println(mantik2);
		
		char a = 'R';
		//System.out.println(a);
		//String ilk = "Ramazan ��da�";
		//System.out.println(ilk);
		
		//System.out.println(15+20);
		//System.out.println("15" + 20);
		
		int s= 20;
		int d = 2;
		int toplam = s+d;
		int c�karma = s-d;
		int carpma = s*d;
		int bolme = s/d;
		//System.out.println("Toplam:" + toplam );
		//System.out.println("��karma:" + c�karma);
		//System.out.println("�arpma:" + carpma);
		//System.out.println("B�lme:" + bolme);
		
		toplam++;
		//System.out.println(toplam);
		c�karma--;
		//System.out.println(c�karma);
				
		int sonuc = s++ + d--;
		//System.out.println(sonuc);
		//System.out.println(s);
		//System.out.println(d);
		
		int sayi1 = 10;
		int sayi2 = 5;		
	
		boolean kosul = (sayi1 / sayi2) == 2; 
		//System.out.print(kosul);
		
		boolean kosul2 = (sayi1 > sayi2);
        boolean kosul3 = (sayi2 < sayi1);		
        System.out.println(kosul2);
        System.out.print(kosul3);
        
        boolean sonuc2 = kosul2 && kosul3;
        System.out.println(sonuc2);
        sonuc2= kosul2 || kosul3;
		System.out.println(sonuc2);
		
       String sonuc3 = (kosul2) ? "Do�ru" : "Yanl��" ;
	    System.out.println(sonuc3);
	
	    sayi1 = sayi2;
	    System.out.println(sayi1);
	    sayi1 += 2;
	    System.out.println(sayi1);
	   
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
