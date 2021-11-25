package com.geekbrains;

public class FirstOOP {

    public static void main(String[] args) {
        clsPerson[] personList = new clsPerson[5];
        personList[0] = new clsPerson("Иванов Иван Иванович", "инженер", "ivanov_ii@mail.ru", "(123)121314", 120000, 35);
        personList[1] = new clsPerson("Петров Петр Петрович", "разведчик", "pertouv@mail.ru", "(000)1234567", 3000000, 40);
        personList[2] = new clsPerson("Баширов Вася Гургенович", "разведчик", "bashirov@nato.ru", "нет", -100000, 40);
        personList[3] = new clsPerson("Пупкин Конь Пальтовский", "мэнэджер", "pkp@google.com", "(999)9999999", 75000, 33);
        personList[4] = new clsPerson("Просто Вася Батькович", "трудяга", "нет", "нет", 20000, 44);
        for (int i = 0; i < personList.length; i++) {
            if (personList[i].getAge() == 40) {
                personList[i].printPerson();
            }
        }
    }

}
