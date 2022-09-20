import hu.petrik.emberekoop.Ember;
import hu.petrik.emberekoop.Emberek;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Ember human = new Ember("Gipsz Jakab", "2001-1-1", "Budapest");
        Ember human2 = new Ember("Teszt Elek", "1985-12-15", "Debrecen");
        Ember human3 = new Ember("Kovács István", "1999-3-30", "Szeged");
        Ember human4 = new Ember("Sárosi Roland", "1997-5-23", "Budapest");
        Ember human5 = new Ember("Kovács János", "1998-7-13", "Debrecen");
        Emberek emberek = new Emberek(new Ember[]{human, human2, human3, human4, human5});

        String fajlNev = "emberek.txt";
        try {
            Emberek emberek2 = new Emberek("emberek.txt");
            System.out.println(emberek2);
        }catch (FileNotFoundException e){
            System.err.printf("Hiba nem található az %s fajl\n", fajlNev);
        } catch (IOException e){
            System.err.println("Ismeretlen hiba történt a fájl beolvasása során");
        }


        System.out.println(emberek);
       // System.out.println(human2);
       // System.out.println(human3);

    }
}