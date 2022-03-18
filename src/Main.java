import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 */

/**
 * @author Jos� Auy�n
 *
 */
public class Main{

	/**
	 * @return 
	 * 
	 */
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  FileReader rd= new FileReader();
		  Deck deck = new Deck(rd.leerArchivo());
		  boolean loop= true;
		  int opcionUsuario = 0;
		  while(opcionUsuario < 7 ) {
	        // Display the menu
	        System.out.println("1\t Agregar carta");
	        System.out.println("2\t Mostrar tipo de carta espec�fica");
	        System.out.println("3\t Nombre, tipo y cantidad de cartas del usuario");
	        System.out.println("4\t Nombre, tipo y cantidad de cartas del usuario ordenada por tipo");
	        System.out.println("5\t Nombre, tipo y cantidad de cartas existentes");
	        System.out.println("6\t Nombre, tipo y cantidad de cartas existentes ordenadas por tipo");
	        System.out.println("7\t Salir del programa");

	        System.out.println("Escoja su opci�n:");
	        
	        //Get user's choice
	        opcionUsuario=scan.nextInt();
	        
	         
	        //Display the title of the chosen module
	        switch (opcionUsuario) {
	            case 1: 
	            	
	                System.out.println("\nUsted escogi�: Agregar carta ");
	                
	                String opcionCarta= scan.next();
	                System.out.println("\n"+opcionCarta);
	                Boolean cartaAgregada =  deck.addCard(opcionCarta);
	                
	                if (cartaAgregada== true) {
	                	System.out.println("\nLa carta se ha agregado exitosamente");
	                }
	                else {
	                	System.out.println("\nHubo un error al agregar la carta");
	                }
	                
	        		 break;
	            case 2: System.out.println("Usted escogi�:  Mostrar tipo de carta espec�fica");
	            		String opcionCartaTipo= scan.next();
	            		//Boolean opcionCartaTipoEleccion = deck.getType(opcionCartaTipo);
	            		//deck.getType(opcionCartaTipo);
	            		//if(opcionCartaTipo==false) {}
	            			
	            		
	                    break;
	            case 3: System.out.println("Usted escogi�: Nombre, tipo y cantidad de cartas del usuario"); 
	            		HashSet<String> hs = new HashSet<String>();
	            		Set<String[]> deckUsuario= deck.setUserDeck(); 
	            		Iterator itr= deckUsuario.iterator();
	            		for (String[] s : deckUsuario) {
	            		    System.out.println(Arrays.toString(s));
	            		}
	            		
	            		
	            		
	                    break;
	                    
	            case 4: System.out.println("Usted escogi�: Nombre, tipo y cantidad de cartas del usuario ordenada por tipo"); 
	            		deck.setOrderedUserDeck();
	            		
	                     break;
	                     
	            case 5: System.out.println("Usted escogi�: Nombre, tipo y cantidad de cartas existentes"); 
	            rd.leerArchivo();
	            //deck.countCards(lectura);
                break;
                
	            case 6: System.out.println("Usted escogi�: Nombre, tipo y cantidad de cartas existentes ordenadas por tipo"); 
	            deck.setOrderedCards();
                break;
                
	            default: System.out.println("Opci�n inv�lida");
	        }
	    }
	}
}