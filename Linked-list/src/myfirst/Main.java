package myfirst;
import List.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new List<>();
        stringList.append_first("hello");
        stringList.append_first("world");
        stringList.append_first("java");
        stringList.printList();

        if (stringList.search("java")) {
            System.out.println("String 'java' found in the list.");
        } else {
            System.out.println("String 'java' not found in the list.");
        }

        stringList.sort();
        stringList.printList();
    }
}
