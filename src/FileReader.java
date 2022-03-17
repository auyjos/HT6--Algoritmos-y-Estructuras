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
		
		Path path = Paths.get("cards_desc.txt");
		Scanner scanner = null;
		ArrayList <String >hechizo = new ArrayList<String>();
		ArrayList <String > monstruo = new ArrayList <String>();
		ArrayList <String> trampa = new ArrayList <String>();
		Map<String,List<String>> database = new HashMap<String,List<String>>();
		
		try {
			scanner = new Scanner(path);
			while(scanner.hasNextLine()){
				
			    //process each line
			    String line = scanner.nextLine();
			    String [] carta = line.split("|"); 
			  
			    
			    if (carta[1] == "Hechizo"){
			    	hechizo.add(carta[0]);
			    }
			    if (carta[1]== "Monstruo") {
			    	monstruo.add(carta[0]);
			    }
			    if (carta[1]== "Trampa") {
			    	trampa.add(carta[0]);
			    }
			    
			    
			}
			
			database.put("Hechizo",hechizo);
			database.put("Trampa", trampa);
			database.put("Monstruo", monstruo);
			scanner.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//read line by line
		
		
		return database;
		// TODO Auto-generated constructor stub
	}

	

}
