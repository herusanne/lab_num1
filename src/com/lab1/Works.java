package com.lab1;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.util.Scanner;


public class Works {
        private ArrayList<Work> works = new ArrayList<Work>();

        public ArrayList<Work> getWorks() {return this.works;}

        public void addWork(Work work) {
            if (work instanceof Work) {
                this.works.add(work);
            } else {
                System.err.print("Error 404!");
            }
        }

    @Override
    public String toString() {


    }
   // LocalDate date = LocalDate.now();
    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        Work work= new Work();
       String birth1;
       Date age=work.getDateOfBirth();
        Date birth = age.parse(birth1);
        birthDate=LocalDate.(work.getDateOfBirth());
        birthDate=work.getDateOfBirth();
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
}
