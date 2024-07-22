package com.perso;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("chien");
        list.add("3");
        list.add("chat");
        list.add("4");
        list.add("5");

        System.out.println("Liste avant traitement : " + list);

        List<Integer> result = new ArrayList<>();

        for (String str : list) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    result.add(Integer.valueOf(str));
                }
            }
        }
        System.out.println("Liste après traitement : " + result);
    }
}