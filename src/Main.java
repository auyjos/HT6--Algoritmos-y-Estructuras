import java.io.InputStream;
import java.util.Scanner;

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
	        // Display the menu
	        System.out.println("1\t Agregar carta");
	        System.out.println("2\t Mostrar tipo de carta espec�fica");
	        System.out.println("3\t Nombre, tipo y cantidad de cartas del usuario");
	        System.out.println("4\t Nombre, tipo y cantidad de cartas del usuario ordenada por tipo");
	        System.out.println("5\t Nombre, tipo y cantidad de cartas existentes");
	        System.out.println("6\t Nombre, tipo y cantidad de cartas existentes ordenadas por tipo");

	        System.out.println("Escoja su opci�n:");
	        
	        //Get user's choice
	        int opcion=scan.nextInt();
	       
	         
	        //Display the title of the chosen module
	        switch (opcion) {
	            case 1: 
	            	
	                System.out.println("Usted escogi�: Agregar carta ");
	                String opcionCarta= scan.nextLine();
	                Boolean cartaAgregada =  deck.addCard(opcionCarta);
	                if (cartaAgregada== true) {
	                	System.out.println("La carta se ha agregado exitosamente");
	                }
	                else {
	                	System.out.println("Hubo un error al agregar la carta");
	                }
	                
	        		 break;
	            case 2: System.out.println("Usted escogi�:  Mostrar tipo de carta espec�fica");
	            
	                    break;
	            case 3: System.out.println("Usted escogi�: Nombre, tipo y cantidad de cartas del usuario"); 
	                    break;
	            case 4: System.out.println("Usted escogi�: Nombre, tipo y cantidad de cartas del usuario ordenada por tipo"); 
	                     break;
	            case 5: System.out.println("Usted escogi�: Nombre, tipo y cantidad de cartas existentes"); 
                break;
                
	            case 6: System.out.println("Usted escogi�: Nombre, tipo y cantidad de cartas existentes ordenadas por tipo"); 
                break;
                
	            default: System.out.println("Opci�n inv�lida");
	        }
	    }
	}