package org.example;

/*Реализуйте структуру телефонной книги с помощью HashMap.
        Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами,
        их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию
        числа телефонов.*/
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setPhoneBook("Вася", "+7995597396");
        phoneBook.setPhoneBook("Вася", "+7995597396");
        phoneBook.setPhoneBook("Вася", "+7995597385");
        phoneBook.setPhoneBook("Иван", "+7995597396");
        phoneBook.setPhoneBook("Иван", "+7996278452");
        phoneBook.setPhoneBook("Иван", "+7812554356");
        phoneBook.setPhoneBook("Сергей", "+79955973496");
        phoneBook.setPhoneBook("Сергей", "+7995523455");
        System.out.println(phoneBook);
        }
    }
