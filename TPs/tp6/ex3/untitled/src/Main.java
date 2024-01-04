import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Saisie du texte
        String text ="";
        // Utilise une table de hachage (Hashtable) pour stocker <mot, nombre>
        Hashtable<String, Integer> map = new Hashtable<>();

        // Séparer le texte en mots
        String[] words = text.split("\\s+");

        // Compter les occurrences de mots
        for (String word : words) {
            // Vérifier si le mot est déjà une clé dans la carte
            if (map.containsKey(word)) {
                // Si oui, augmenter la valeur du mot par 1 dans la carte
                map.put(word, map.get(word) + 1);
            } else {
                // Sinon, ajouter le mot comme clé avec la valeur 1 dans la carte
                map.put(word, 1);
            }
        }
        System.out.println("before sorting ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("after sorting ");
        // Utiliser TreeMap pour trier le map
        TreeMap<String, Integer> sortedWordCountMap = new TreeMap<>(map);

        for (Map.Entry<String, Integer> entry : sortedWordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}