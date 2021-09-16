//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.lab1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

    /*
    Определить количество товаров, проданных продавцом «Иванов», вывести сведения о них и
    определить товар с максимальной стоимостью.
Продавец
Наименование
Количество
Цена
Дата продажи
*/

public class Book {
    private String seller;
    private String title;
    private int quantity;
    private double price;
    private Date dateOfSale;

    public Book() {
    }

    public String getSeller() {
        return this.seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateOfSale() {
        return this.dateOfSale;
    }

    public void setDateOfSale(String dateOfSale) {
        try {
            this.dateOfSale = (new SimpleDateFormat("dd/MM/y")).parse(dateOfSale);
        } catch (ParseException var3) {
        }

    }
}
