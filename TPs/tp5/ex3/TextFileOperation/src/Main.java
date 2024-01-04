import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        copyFileCharacterByCharacter();
        listFileContentsWithLineNumbers();
        findLongestWord();
    }

    // Exercice 1: Copier des données caractère par caractère ou ligne par ligne
    public static void copyFileCharacterByCharacter() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("fichier.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("fichier2.txt"));
            int character;

            while ((character = reader.read()) != -1) {
                writer.write((char)character);
            }

            reader.close();
            writer.close();
            System.out.println("Copie caractère par caractère terminée.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void copyFileLineByLine() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("fichier.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("fichier2.txt"));
            String character;

            while ((character = reader.readLine()) != null) {
                writer.write(character);
            }

            reader.close();
            writer.close();
            System.out.println("Copie caractère par caractère terminée.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Exercice 2: Lister le contenu du fichier en numérotant les lignes
    public static void listFileContentsWithLineNumbers() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("fichier.txt"));
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + " " + line);
                lineNumber++;
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Exercice 3: Trouver le mot le plus long dans un fichier texte
    public static void findLongestWord() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("fichier.txt"));
            String line;
            String longestWord = "";

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }

            System.out.println("Le mot le plus long est : " + longestWord);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void countWordsInFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("fichier.txt"));
            String line;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Utilisez une expression régulière pour diviser les mots
                wordCount += words.length;
            }

            System.out.println("Nombre de mots dans le fichier : " + wordCount);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void appendTextToFile(String textToAppend) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("fichier.txt", true)); // Le paramètre true indique l'ajout
            writer.write(textToAppend);
            writer.newLine();
            writer.close();
            System.out.println("Texte ajouté au fichier avec succès.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeMultiplesToFile(double real, int maxMultiple) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("multiples.txt"));
            for (int i = 1; i <= maxMultiple; i++) {
                double multiple = real * i;
                writer.write(i + " " + multiple);
                writer.newLine();
            }
            writer.close();
            System.out.println("Multiples ajoutés au fichier avec succès.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void createOutputFileWithLineLengths() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("fichier.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("fichier2.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                int lineLength = line.length();
                writer.write(String.valueOf(lineLength));
                writer.newLine();
            }

            reader.close();
            writer.close();
            System.out.println("Fichier de sortie créé avec les longueurs de lignes.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void numberLinesInFile(String inputFileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(inputFileName.replace(".txt", "-num.txt")));
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                writer.write(lineNumber + " " + line);
                writer.newLine();
                lineNumber++;
            }

            reader.close();
            writer.close();
            System.out.println("Lignes numérotées dans le fichier de sortie.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void replaceRandomCharacterWithExclamation() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("fichier.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("fichier2.txt"));
            String line;
            Random random = new Random();

            while ((line = reader.readLine()) != null) {
                int randomIndex = random.nextInt(line.length());
                char[] characters = line.toCharArray();
                characters[randomIndex] = '!';
                writer.write(String.valueOf(characters));
                writer.newLine();
            }

            reader.close();
            writer.close();
            System.out.println("Caractère aléatoire remplacé par «<!» dans le fichier de sortie.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeStringArrayToFile(String[] array, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            for (String item : array) {
                writer.write(item);
                writer.newLine();
            }

            writer.close();
            System.out.println("Tableau de String écrit dans le fichier avec succès.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
