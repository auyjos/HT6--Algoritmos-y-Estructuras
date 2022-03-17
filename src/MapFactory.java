import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
/**
 * MapFactory
 */
public class MapFactory <K,V>{

    public Map<K,V> getMap (String type) {
        switch (type) {
            case "Hash":
                return new HashMap<>();
            
            case "Tree":
                return new TreeMap<>();

            case "LinkedHashMap":
                return new LinkedHashMap<>();
        
            default:
                return new HashMap<>();
        }
    }
}