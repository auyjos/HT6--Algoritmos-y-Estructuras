import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author José Auyón
 *
 */
public class FileReader {

	/**
	 * @return 
	 * 
	 */
	public Map<String,List<String>> leerArchivo() {
		
		//Creación variables
		Path path = Paths.get("cards_desc.txt");
		Scanner scanner = null;
		ArrayList <String >hechizo = new ArrayList<String>();
		ArrayList <String > monstruo = new ArrayList <String>();
		ArrayList <String> trampa = new ArrayList <String>();
		Map<String,List<String>> database = new HashMap<String,List<String>>();
		
		try {
			scanner = new Scanner(path);
			while(scanner.hasNextLine()){
				
			    //procesa cada en línea
			    String line = scanner.nextLine();
			    String [] carta = line.split("\\|"); 
			   
			    // escoge el indice de la linea, borra los espacios y compara los strings para obtener tipo y carta
			    if (carta[1].trim().equalsIgnoreCase("Hechizo")){
			    	hechizo.add(carta[0].trim());
			    }
			    if (carta[1].trim().equalsIgnoreCase("Monstruo")) {
			    	monstruo.add(carta[0].trim());
			    }
			    if (carta[1].trim().equalsIgnoreCase("Trampa")) {
			    	trampa.add(carta[0].trim());
			    }
			    
			    
			}
			
			//Añade a database
			database.put("Hechizo",hechizo);
			database.put("Trampa", trampa);
			database.put("Monstruo", monstruo);
			scanner.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return database;
		// TODO Auto-generated constructor stub
	}

	

}
