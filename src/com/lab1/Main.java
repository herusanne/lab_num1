package com.lab1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Locale;

    public class Main {
        public Main() {
        }

        public static void main(String[] args) throws Exception {
            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in);
           // Books books = SideStuff.generateBooks(scanner);
           // System.out.println(books.toString());
            Works works = SideStuff.generateWorker(scanner);
            System.out.println(works.toString());
            scanner.close();
        }
    }





