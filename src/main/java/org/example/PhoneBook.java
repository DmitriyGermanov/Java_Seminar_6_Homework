package org.example;

import java.util.HashMap;
import java.util.Objects;

public class PhoneBook {
    HashMap<String, String> phoneBook = new HashMap<>();

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneBook phoneBook1)) return false;
        return Objects.equals(getPhoneBook(), phoneBook1.getPhoneBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhoneBook());
    }

    public void setPhoneBook(HashMap<String, String> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public HashMap<String, String> getPhoneBook() {
        return phoneBook;
    }
}
