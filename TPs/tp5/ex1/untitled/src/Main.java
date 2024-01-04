import java.io.*;

public class Main {
        public static void convertTextToBinary(String textFileName, String binaryFileName) {
            try (
                FileReader a = new FileReader(textFileName);
                BufferedReader fis = new BufferedReader(a);
                FileOutputStream fos = new FileOutputStream(binaryFileName);
            )
            {   String line;

                while ((line = fis.readLine()) != null) {
                    fos.write(line.getBytes());
                }
                a.close();
                fos.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }


            // Delete the original text file
           /* File file = new File(textFileName);
            if (file.exists()) {
                file.delete();
            }*/
        }
         public static void main(String[] args) {
            convertTextToBinary("fichier.txt","fichier.bin");

        }
}