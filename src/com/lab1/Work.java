package com.lab1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Work {
    /*Фамилия
    Имя
    Отчество
    Должность
    Зарплата
    Дата рождения
    Вывести данные о самом молодом сотруднике.

    */
    private String firstName;
    private String lastName;
    private String position;
    private int salary;
    private Date dateOfBirth;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) throws ParseException {
        try {
            this.dateOfBirth = new SimpleDateFormat("dd/MM/y").parse(dateOfBirth);
        } catch (ParseException pe) {
            System.err.println("Error!");
        }
    }

    public static Work generateWorker(Scanner scanner) throws Exception {
        System.out.print("Please input the quantity of workers: ");
        final int num = scanner.nextInt();
        scanner.nextLine();

        Work worker = new Work();
        for (int i = 0; i < num; i++) {
            Work dateOfWorker = new Work();
            System.out.println("\n Worker num " + (i + 1) + " ");

            // Name
            System.out.print("Enter the first name of worker: ");
            String first = scanner.nextLine();
            dateOfWorker.setFirstName(first);
            // Last Name
            System.out.print("Enter the last name of worker: ");
            String last = scanner.nextLine();
            dateOfWorker.setLastName(last);
            // Position
            System.out.print("Enter the position of worker: ");
            String position = scanner.nextLine();
            dateOfWorker.setPosition(position);
            // Salary
            int salary;
            do {
                System.out.print("Enter the salary of worker: ");

                while (!scanner.hasNextInt()) {
                    System.err.print("Enter the salary of worker again, please: ");
                    scanner.next();
                }
                salary = scanner.nextInt();
                dateOfWorker.setSalary(salary);
            } while (salary <= 0);

            // Birthday
            while (true) {
                System.out.print("Enter the date of birth (dd/mm/yy format): ");
                String date = scanner.next();
                if (checkDate(date)) {
                    dateOfWorker.setDateOfBirth(date);
                    break;
                }
            }
            scanner.nextLine();

            worker.addWorker(dateOfWorker);
        }
return worker;
    }
    public static boolean checkDate (String date){
        String RegExp = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])$";
        return date.matches(RegExp);
    }
    public void addWorker(Work work) {
        if (work != null) {
            Scanner scanner= new Scanner(System.in);
            String worker = scanner.nextLine();
        }
        else {
            System.err.print("We gotta get a mistake, oops!");
        }
    }
}


