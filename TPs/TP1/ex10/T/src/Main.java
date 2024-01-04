
import java.util.Random;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Random r=new Random();
        int[]T =new int[100];
        for(int i=0;i<100;i++){
            T[i]=r.nextInt(100,200);
        }
        for(int i=0;i<100;i++){
            System.out.println(T[i]);
        }
        int max=T[0];
        for(int i=0;i<100;i++){
            if(max<T[i])
                max=T[i];
        }
        int min=T[0];
        for(int i=0;i<100;i++){
            if(min>T[i])
                min=T[i];
        }
        float avg=0;
        for(int i=0;i<100;i++){
            avg+=T[i];

        }
        avg/=100;
        int[] occurence=new int[200];
        for(int i=0;i<100;i++){
            occurence[T[i]-100]++;
        }
        int max_occurence=0;
        int element =occurence[0];
        for(int i=0;i<100;i++){
            if(max_occurence<occurence[T[i]]) {
                max_occurence = occurence[T[i]];
                element=T[i];
            }

        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
        System.out.println("le max d'occurence est :  " + element + " avec nbr d'occur = " + max_occurence);

    }
}