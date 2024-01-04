import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    // Affichage dans l'ordre naturel
    public static <T> void afficherOrdreNaturel(List<T> list) {
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Affichage dans l'ordre inverse (Solution 1)
    public static <T> void afficherOrdreInverse1(List<T> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    // Affichage dans l'ordre inverse (Solution 2)
    public static <T> void afficherOrdreInverse2(List<T> list) {
        List<T> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        for (T element : reversedList) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Affichage des éléments de rang pair (0, 2, 4...)
    public static <T> void afficherElementsRangPair(List<T> list) {
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Mise à zéro des éléments de valeur négative (Solution 1)
    public static void miseAZeroElementsNegatifs1(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.set(i, 0);
            }
        }
    }

    // Mise à zéro des éléments de valeur négative (Solution 2)
    public static <T extends Number> void miseAZeroElementsNegatifs2(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).doubleValue() < 0) {
                list.set(i, (T) (Number) 0);
            }
        }
    }
    public static void main(String[] args) {

        ArrayList<Integer>tab=new ArrayList<>();
        tab.add(1);tab.add(15);tab.add(-21);tab.add(21);tab.add(36);
        System.out.println("ordre normale");
        afficherOrdreNaturel(tab);
        System.out.println("ordre inverse 1 :");
        afficherOrdreInverse1(tab);
        System.out.println("ordre inverse 2:");
        afficherOrdreInverse2(tab);
        System.out.println("nombre pair ");
        afficherElementsRangPair(tab);
        System.out.println("mise a zero \n before :");
        afficherOrdreNaturel(tab);
        System.out.println("after");
        miseAZeroElementsNegatifs1(tab);

    }
}
