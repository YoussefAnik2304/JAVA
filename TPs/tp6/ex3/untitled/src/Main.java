import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Saisie du texte
        String text ="hello who hello yes who no yes who no hello o  ";
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
        TreeSet<Map.Entry<String, Integer>> sortedWordOccurrencesSet = new TreeSet<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                if(entry1.getValue().compareTo(entry2.getValue())==0){
                    return entry1.getKey().compareTo(entry2.getKey());
                }
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });
        sortedWordOccurrencesSet.addAll(map.entrySet());
        System.out.println("treeset ");
        for (Map.Entry<String,Integer> a : sortedWordOccurrencesSet){
            System.out.println(a.getKey()+ " " + a.getValue());
        }


    }
}