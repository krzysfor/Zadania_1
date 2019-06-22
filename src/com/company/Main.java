package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

/*        String [] names = {"krzys", "Janusz", "Maciej","Ania", "Robert"};


        for (int i = 0; i < 5 ; i++) {

            if (i%2 != 0) {
                System.out.println(names[i]);
            }
            System.out.println("\n");

        }*/

        // tworzenie pliu
        // Files.createFile(Paths.get("/home/kformela/Test/plik2.txt"));


        /// zapis do pliu
 /*       PrintWriter zapis = new PrintWriter("/home/kformela/Test/plik2.txt");

        for (int i = 0; i < 5 ; i++) {
            zapis.println(names[i]);

        }
        zapis.close();*/



        // odczyt z pliku

 /*       File file = new File("/home/kformela/Test/plik2.txt");
        Scanner in = new Scanner(file);
        String zdanie = in.nextLine();
        System.out.println(zdanie);*/


      //  Files.createFile(Paths.get("/home/kformela/Test/losowe1.txt"));
      //  Files.createFile(Paths.get("/home/kformela/Test/losowe2.txt"));
        PrintWriter zapis1 = new PrintWriter("/home/kformela/Test/losowe1.txt");
        PrintWriter zapis2 = new PrintWriter("/home/kformela/Test/losowe2.txt");

        int [] tableRandom1 = new int[100];
        int [] tableRandom2 = new int[100];

        for (int i = 0; i < 100 ; i++) {

            int random1 = (int) (Math.random()*100 +1);
            int random2 = (int) (Math.random()*100 +1);

            tableRandom1[i] = random1;
            tableRandom2[i] = random2;
            zapis1.println(tableRandom1[i]);
            zapis2.println(tableRandom2[i]);
            //System.out.println(tableRandom[i]);
        }


        zapis1.close();
        zapis2.close();



        File file1 = new File("/home/kformela/Test/losowe1.txt");
        File file2 = new File("/home/kformela/Test/losowe2.txt");


       // File file = new File(String.valueOf(file1));
        Scanner scanner1 = new Scanner(file1);
        Scanner scanner2 = new Scanner(file2);
        ArrayList<String> items1 = new ArrayList<>();
        ArrayList<String> items2 = new ArrayList<>();



        while(scanner1.hasNextLine()){
            String line1 = scanner1.nextLine();

            int counter = 0;

                while (scanner2.hasNextLine()){
                    String line2 = scanner2.nextLine();

                    if (line1.equals(line2)) {
                            counter++;

                    }

                }
            System.out.println(line1.toString() + "licznik: " + counter);

        }



    }
}
