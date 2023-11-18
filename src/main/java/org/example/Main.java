package org.example;

/*Реализуйте структуру телефонной книги с помощью HashMap.
        Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
        их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию
        числа телефонов.*/
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.entryAdd("Вася", "+7995597396");
        phoneBook.entryAdd("Вася", "+7995597396");
        phoneBook.entryAdd("Вася", "+7995597385");
        phoneBook.entryAdd("Иван", "+7995597396");
        phoneBook.entryAdd("Иван", "+7996278452");
        phoneBook.entryAdd("Иван", "+7812554356");
        phoneBook.entryAdd("Сергей", "+79955973496");
        phoneBook.entryAdd("Сергей", "+7995523455");
        phoneBook.entryAdd("Антон", "+79962783452");

        System.out.println("Демонстрация метода getPhoneBook:");
        System.out.println(phoneBook.getPhoneBook() + "\n");
        System.out.println("Демонстрация метода toString:");
        System.out.println(phoneBook + "\n");
        System.out.println("Демонстрация сортированного вывода:");
        System.out.println(phoneBook.sortedOut() + "\n");
        System.out.println("Демонстрация удаления записи 'Вася':");
        phoneBook.entryDel("Вася");
        System.out.println(phoneBook.sortedOut());

    }
}
