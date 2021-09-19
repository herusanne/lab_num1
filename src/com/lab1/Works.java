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
        int minAge=Integer.MAX_VALUE;
        int age;
        //String[] year = work.getDateOfBirth().split("/");
        for (int i =0;i<works.size();i++)
        {
            Work temp = works.get(i);
            String[] year = temp.getDateOfBirth().split("/");
            int[] intYear=new int[year.length];
            int j=0;
            for(String changer:year){
                intYear[j]=Integer.parseInt(changer);//Exception in this line
                j++;

            }
            age = 2021-intYear[2];
            if (minAge>age)minAge=age;
        }
            String ageFin= String.valueOf(minAge);
            //System.out.println("\n[RESULT (YOUNGER)]\n"+age);
            StringBuilder answer = new StringBuilder();
            answer.append("\n[RESULT: THE YOUNGER WORKER]\n");
            answer.append(ageFin);
        return answer.toString();
    }
}
