import java.util.*;

public class M3Nivell2 {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		int alumnesNotes [][] = new int[5][3];
		
		
			for (int i=0; i<alumnesNotes.length; i++) {
				for (int j=0; j<alumnesNotes[i].length; j++) {
					int a = i+1;
					int b = j+1;
					Scanner sc = new Scanner (System.in);		
					System.out.print("[Alumne " +a +"] [Nota "+b+"]: " );		 
					alumnesNotes [i][j] = sc.nextInt();	 			
				}
			}
			
			
	for (int bucle=0; bucle<alumnesNotes.length; bucle++ ){
		int acumbucle=bucle+1;

		
			int suma = 0;
			int elements = 0;
			for (int i=0; i<alumnesNotes.length; i++) {
				for (int j=0; j<alumnesNotes[i].length; j++) {
					int valors = alumnesNotes [bucle][j];
					suma = suma + valors;
					elements = elements + 1;
				}				
			}
			
			float promig= (float) suma / elements;
			System.out.println("-------------------");	
			System.out.println("El promig de l'alumne " +acumbucle+"  és :" + promig);			
			if (promig <5 ) {
				System.out.println("L'alumne "+acumbucle+ " està SUSPÈS");
			} else {
				System.out.println("L'alumne "+acumbucle+ " està APROVAT");	
			}	
	}

}
}
