package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, List<String>> phoneBook = new HashMap<>();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<String>> map : phoneBook.entrySet()) {
            stringBuilder.append("Имя - ");
            stringBuilder.append(map.getKey());
            stringBuilder.append(", Телефоны - ");
            int temp = 0;
            for (String value : map.getValue()) {
                if (temp != 0){
                    stringBuilder.append(", ");
                    temp++;
                }
                stringBuilder.append(value);
            }

            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void setPhoneBook(String name, String phone) {
        if (this.phoneBook.containsKey(name)) {
        } else {
            LinkedList list = new LinkedList();
            list.add(phone);
            this.phoneBook.put(name, list);
        }
    }


}
