package ru.skypro;

public class Main {

    public static void main(String[] args) {
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        String fullNameUpp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpp);

        String fullNameEdit = fullName.replace("ё","е");
        System.out.println("Данные ФИО сотрудника — " + fullNameEdit);


    }


}
