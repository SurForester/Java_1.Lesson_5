package com.geekbrains;

public class clsPerson {

    private String strFIO;
    private String strVacation;
    private String strEmail;
    private String strPhoneNum;
    private int intPayment;
    private int intAge;

    public clsPerson(String fio, String vacation, String email, String phone, int paym, int age) {
        this.intAge = age;
        this.intPayment = paym;
        this.strEmail = email;
        this.strFIO = fio;
        this.strPhoneNum = phone;
        this.strVacation = vacation;
    }

    public void printPerson() {
        System.out.println("Информация о сотруднике:");
        System.out.println("ФИО - " + strFIO);
        System.out.println("должность - " + strVacation);
        System.out.println("E-mail - " + strEmail);
        System.out.println("Телефон - " + strPhoneNum);
        System.out.println("ЗП - " + intPayment + " руб.");
        System.out.println("Возраст - " + intAge);
    }

    public int getAge () {
        return intAge;
    }

}
