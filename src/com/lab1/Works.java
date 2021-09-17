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
        Work work= new Work();
        int age=0;
        String[] year = work.now().split("///");
        Integer[] intYear=new Integer[year.length];
        int i=0;
        for(String changer:year){
            intYear[i]=Integer.parseInt(changer);//Exception in this line
            i++;

        }

           // age=2021-intYear[i];

        String ageFin= String.valueOf(age);
        //System.out.println("\n[RESULT (YOUNGER)]\n"+age);
        StringBuilder answer = new StringBuilder();
        answer.append("\n[RESULT (YOUNGER)]\n");
        answer.append(ageFin);
        return answer.toString();
   // LocalDate date = LocalDate.now();

        /*
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
        */
    }
}
