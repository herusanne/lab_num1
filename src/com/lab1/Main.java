package com.lab1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    /*
    Определить количество товаров, проданных
продавцом «Иванов», вывести сведения о них и
определить товар с максимальной стоимостью.
Продавец
Наименование
Количество
Цена
Дата продажи
*/
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        book = Book.generateBooks(scanner);
        System.out.println(book.toString());
        //System.out.println(conclusion());
    }


}





