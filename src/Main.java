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
 * @author José Auyón
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
	        System.out.println("2\t Mostrar tipo de carta específica");
	        System.out.println("3\t Nombre, tipo y cantidad de cartas del usuario");
	        System.out.println("4\t Nombre, tipo y cantidad de cartas del usuario ordenada por tipo");
	        System.out.println("5\t Nombre, tipo y cantidad de cartas existentes");
	        System.out.println("6\t Nombre, tipo y cantidad de cartas existentes ordenadas por tipo");
	        System.out.println("7\t Salir del programa");

	        System.out.println("Escoja su opción:");
	        
	        //Get user's choice
	        opcionUsuario=scan.nextInt();
	        
	         
	        //Display the title of the chosen module
	        switch (opcionUsuario) {
	            case 1: 
	            	
	                System.out.println("\nUsted escogió: Agregar carta ");
	                
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
	            case 2: System.out.println("Usted escogió:  Mostrar tipo de carta específica");
	            String opcionCartaEsp= scan.next();
                System.out.println("\n"+opcionCartaEsp);
                Boolean cartaEsp =  deck.addCard(opcionCartaEsp);
                
                if (cartaEsp== true) {
                	System.out.println("\nLa carta se ha encontrado");
                }
                else {
                	System.out.println("\n No se encontró la carta");
                }
	            		
	                    break;
	            case 3: System.out.println("Usted escogió: Nombre, tipo y cantidad de cartas del usuario"); 
	            		HashSet<String> hs = new HashSet<String>();
	            		Set<String[]> deckUsuario= deck.setUserDeck(); 
	            		Iterator itr= deckUsuario.iterator();
	            		for (String[] s : deckUsuario) {
	            		    System.out.println(Arrays.toString(s));
	            		}
	            		
	            		
	            		
	                    break;
	                    
	            case 4: System.out.println("Usted escogió: Nombre, tipo y cantidad de cartas del usuario ordenada por tipo"); 
	            		deck.setOrderedUserDeck();
	            		
	                     break;
	                     
	            case 5: System.out.println("Usted escogió: Nombre, tipo y cantidad de cartas existentes"); 
	            HashSet<String> hsGeneral = new HashSet<String>();
        		Set<String[]> deckGeneral= deck.setOrderedCards();
        		Iterator itrGeneral= deckGeneral.iterator();
        		for (String[] s : deckGeneral) {
        		    System.out.println(Arrays.toString(s));
        		}
                break;
                
	            case 6: System.out.println("Usted escogió: Nombre, tipo y cantidad de cartas existentes ordenadas por tipo"); 
	            HashSet<String> hsGeneralTipo = new HashSet<String>();
        		Set<String[]> deckGeneralTipo= deck.setOrderedUserDeck();
        		Iterator itrGeneralTipo= deckGeneralTipo.iterator();
        		for (String[] s : deckGeneralTipo) {
        		    System.out.println(Arrays.toString(s));
        		}
                break;
                
	            default: System.out.println("Opción inválida");
	        }
	    }
	}
}