import java.util.*;

public class M3Nivell2 {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		int alumnesNotes [][] = new int[5][3];
		
// entrada de les dades per consola dins de array de 5 alumnes x 3 notes
		
			for (int i=0; i<alumnesNotes.length; i++) {
				for (int j=0; j<alumnesNotes[i].length; j++) {
					int a = i+1;
					int b = j+1;
					Scanner sc = new Scanner (System.in);		
					System.out.print("[Alumne " +a +"] [Nota "+b+"]: " );		 
					alumnesNotes [i][j] = sc.nextInt();	 			
				}
			}
			
// bucle per recórrer 5 cops el array tenint en compte la seva llargada
			
	for (int bucle=0; bucle<alumnesNotes.length; bucle++ ){  
		int acumbucle=bucle+1;


// doble bucle for per recórrer l'array tenint en compte el bucle anterior, per a l'alumne i recorrerà bucle vegades l'array i farà el promig 

			int suma = 0;
			int elements = 0;
			for (int i=0; i<alumnesNotes.length; i++) {			
				for (int j=0; j<alumnesNotes[i].length; j++) {
					int valors = alumnesNotes [bucle][j];
					suma = suma + valors;
					elements = elements + 1;
				}				
			}
			
			float promig= (float) suma / elements;       // càlcul del promig 
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
