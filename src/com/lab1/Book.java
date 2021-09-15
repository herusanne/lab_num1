package com.lab1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Book {
    private String seller;
    private String title;
    private int quantity;
    private int price;
    private Date dateOfSale;

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(String dateOfSale) throws ParseException {
        try {
            this.dateOfSale = new SimpleDateFormat("dd/MM/y").parse(dateOfSale);
        } catch (ParseException pe) {
            System.err.println("Error!");
        }
    }

    public static Book generateBooks(Scanner scanner) throws Exception {
        System.out.print("Pass the amount of books: ");
        final int num = scanner.nextInt();
        scanner.nextLine();

        Book book = new Book();
        for (int i = 0; i < num; i++) {
            Book dateOfBook = new Book();
            System.out.println("\n BOOK " + (i + 1) + " ");

            // Name
            System.out.print("Enter the title of book: ");
            String title = scanner.nextLine();
            dateOfBook.setSeller(title);

            // Seller
            System.out.print("Enter the second name of seller: ");
            String seller = scanner.next();
/*
            System.out.print("Enter the second name of seller: ");
            seller += " " + scanner.next();
            dateOfBook.setSeller(seller);
*/
            // Number of books
            int quantity;
            do {
                System.out.print("Enter the quantity of books: ");

                while (!scanner.hasNextInt()) {
                    System.err.print("Enter the quantity of books: ");
                    scanner.next();
                }
                quantity = scanner.nextInt();
                dateOfBook.setQuantity(quantity);
            } while (quantity <= 0);

            // Price of books
            int price;
            do {
                System.out.print("Enter the price of books: ");

                while (!scanner.hasNextInt()) {
                    System.err.print("Enter the price of books: ");
                    scanner.next();
                }
                price = scanner.nextInt();
                dateOfBook.setPrice(price);
            } while (price <= 0);

            // Date of sale
            while (true) {
                System.out.print("Enter the date (d/m/y format): ");
                String date = scanner.next();
                if (checkDate(date)) {
                    dateOfBook.setDateOfSale(date);
                    break;
                }
            }
            scanner.nextLine();

            book.addBook(dateOfBook);
        }

        return book;
    }
    public void addBook(Book book) {
        if (book != null) {
            Scanner scanner= new Scanner(System.in);
            String books = scanner.nextLine();
        }
        else {
            System.err.print("It is not even a book!");
        }
    }
    public static boolean checkDate (String date){
            String RegExp = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])$";
            return date.matches(RegExp);
    }
    /*
    public String toString() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();
        Book book = new Book();
        if (book.getSeller() == "Ivanov") {
            answer.append(String.format("\n\n[RESULT]\nSeller: %s\nTitle: %d\nQuantity: %d\nPrice: %d\nDate of sale: %s\n",
                    book.getSeller(), book.getTitle(), book.getQuantity(), book.getPrice(), book.getDateOfSale()));
            int maxPrice=0;
            String expensiver="";
            /*
            int [] mas = new int[100];
            for (int i = 0; i < book.getQuantity(); i++) {
                if(maxPrice <= mas[i]){
                    maxPrice = mas[i];
                }
            }
            if(maxPrice == book.getPrice())
                System.out.println("\n The most expensive one book from Ivanov is "+ book.getTitle() + " it costs "+ book.getPrice());

        }
        return answer.toString();
    }
    */
    @Override
    public String toString() {
        Book book = new Book();
        if (book.getSeller() == "Ivanov") {
            System.out.print(String.format("\n\n[RESULT]\nSeller: %s\nTitle: %d\nQuantity: %d\nPrice: %d\nDate of sale: %s\n",
                    book.getSeller(), book.getTitle(), book.getQuantity(), book.getPrice(), book.getDateOfSale()));
        }
        return super.toString();
    }
}