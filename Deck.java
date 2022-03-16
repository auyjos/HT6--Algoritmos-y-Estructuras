import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Deck
 */
public class Deck {

    private Map<String,List<String>> database;
    private List<String> userDeck;

    /**
     * Constructor que inicializa el deck con la base de datos
     * @param database
     */
    public Deck (Map<String,List<String>> database) {
        this.database = database;
    }

    /**
     * Agrega una carta a la coleccion del usuario
     * @param cardname
     * @return true si la carta solicitada existe; false si no.
     */
    public boolean addCard (String cardname) {
        for (Map.Entry<String, List<String>> cards : database.entrySet()) {
            for (String card: cards.getValue()){
                if (cardname == card) {
                    userDeck.add(card);
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * Obtiene el tipo de una carta
     * @param cardname
     * @return
     */
    public String getType (String cardname) {
        for (Map.Entry<String,List<String>> cards : database.entrySet()) {
            for (String card: cards.getValue()){
                if (cardname == card) {
                    return cards.getKey();
                }
            }
        }
        return null;
    }

    /**
     * Crea un set ordenado de las cartas del usuario
     * @return deckSet
     */
    public Set<String[]> setUserDeck () {
        LinkedHashSet<String[]> deckSet = new LinkedHashSet<String[]>();
        for (String card: userDeck) {
            String [] entry = new String [3];
            entry[0] = card;
            entry[1] = getType(card);
            entry[2] = String.valueOf(countCards(card));
            deckSet.add(entry);
        }
        return deckSet;
    }

    /**
     * Crea un set ordenado de las cartas del usuario, ordenadas por tipo
     * @return deckSet
     */
    public Set<String[]> setOrderedUserDeck () {
        LinkedHashSet<String[]> deckSet = new LinkedHashSet<String[]>();
        LinkedHashSet<String[]> deckSetTypeA = new LinkedHashSet<String[]>();
        LinkedHashSet<String[]> deckSetTypeB = new LinkedHashSet<String[]>();
        LinkedHashSet<String[]> deckSetTypeC = new LinkedHashSet<String[]>();
        for (String card: userDeck) {
            String [] entry = new String [3];
            entry[0] = card;
            entry[1] = getType(card);
            entry[2] = String.valueOf(countCards(card));
            switch (entry[1]) {
                case "Mostruo":
                    deckSetTypeA.add(entry);
                    break;
                case "Hechizo":
                    deckSetTypeB.add(entry);
                    break;
                case "Trampa":
                    deckSetTypeC.add(entry);
                    break;
            }
        }
        deckSet.addAll(deckSetTypeA);
        deckSet.addAll(deckSetTypeB);
        deckSet.addAll(deckSetTypeC);
        return deckSet;
    }

    /**
     * Crea un set ordenado de las cartas existentes, ordenadas por tipo
     * @return cardSet
     */
    public Set<String[]> setOrderedCards () {
        LinkedHashSet<String[]> cardSet = new LinkedHashSet<String[]>();
        for (Map.Entry<String,List<String>> cards : database.entrySet()) {
            for (String card: cards.getValue()){
                String[] entry = {card,cards.getKey()};
                cardSet.add(entry);
            }
        }
        return cardSet;
    }

    /**
     * Cuenta la cantidad de cartas que el usuario tiene de la carta especificada
     * @param card
     * @return counter
     */
    private int countCards (String card){
        int counter = 0;
            for (String c : userDeck) {
                if (c == card) {
                   counter++;
                }
            }
        return counter;
    }

}
