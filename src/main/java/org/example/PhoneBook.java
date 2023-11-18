package org.example;

import java.util.*;

public class PhoneBook {
    public Map<String, List<String>> getPhoneBook() {
        return phoneBook;
    }

    Map<String, List<String>> phoneBook = new HashMap<>();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List<String>> map : phoneBook.entrySet()) {
            stringBuilder.append("Имя - ");
            stringBuilder.append(map.getKey());
            stringBuilder.append(", Телефоны - ");
            boolean temp = false;
            for (String value : map.getValue()) {
                if (temp) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(value);
                temp = true;
            }

            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public String sortedOut() {
        Map<Integer, String> sortedTree = new TreeMap<Integer, String>(Collections.reverseOrder());
        for (Map.Entry<String, List<String>> map : phoneBook.entrySet()) {
            sortedTree.put(map.getValue().size(), map.getKey());
        }
        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<Integer, String> map : sortedTree.entrySet()) {
            stringBuilder.append("Имя - ");
            stringBuilder.append(map.getValue());
            stringBuilder.append(", Телефоны - ");
            boolean temp = false;
            for (String value : this.phoneBook.get(map.getValue())) {
                if (temp) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(value);
                temp = true;
            }

            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void entryAdd(String name, String phone) {
        if (this.phoneBook.containsKey(name)) {
            if (!this.phoneBook.get(name).contains(phone)) {
                phoneBook.get(name).add(phone);
            }
        } else {
            LinkedList list = new LinkedList();
            list.add(phone);
            this.phoneBook.put(name, list);
        }
    }
    public void entryDel(String name){
        if (this.phoneBook.containsKey(name)){
            this.phoneBook.remove(name);
        }
    }

}
