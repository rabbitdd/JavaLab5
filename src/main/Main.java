package main;

import Data.Sources;
import commands.*;


import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;

/**
 * Класс Main
 * @author Мишанин Никита
 */

public class Main implements Sources{

    public static void main(String[] args) {
        try {
            //System.setProperty("console.encoding", "utf-8");
            BufferedInputStream input = new BufferedInputStream(new FileInputStream(path_in));
            Reader jsonReader = new InputStreamReader(input);
            ArrayDeque<HumanBeing> HumanityJson;
            ArrayDeque<HumanBeing> Humanity = new ArrayDeque<>();
            HumanBeing HUMAN = new HumanBeing();
            HashSet<String> set = new HashSet<>();
            ArrayList<?> SortList = new ArrayList<>();
            HashSet<Long> ID = new HashSet<>();
            HumanityJson = GSON.fromJson(jsonReader, ArrayDeque.class);
            for (Object Human : HumanityJson) {
                HUMAN = GSON.fromJson(String.valueOf(Human), HumanBeing.class);
                // System.out.println(HUMAN.getName());
                Humanity.add(HUMAN);
                ID.add(HUMAN.getId());
            }
            Collection collection = new Collection();
            Application App = new Application(collection, Humanity, HUMAN, ID, SortList, set);
            App.runApp();
        } catch (java.lang.Exception e) {
            //e.printStackTrace();
            String ex = e.toString();
            if (ex.equals("java.io.FileNotFoundException: /home/s284694/JavaLab5/Data/Input.json (Permission denied)"))
                System.out.println("У вас нет прав доступа на файл Input.json, перейдите в каталог Data и измените права");
            else
                if (ex.equals("java.io.FileNotFoundException: " + path_in + " (Не удается найти указанный файл)"))
                    System.out.println("Системе не удается найти указанный файл, проверьте имя");
                else
                    if (ex.equals("java.lang.NullPointerException"))
                        System.out.println("Неверное имя файла, проверьте имя файла в переменной окружения");
            //String[] exception = e.toString().split(" ");
            //e.printStackTrace();
            //System.out.println(e.toString());
            //for (String n: exception) {
            //  System.out.println(n);
            //}
            /*if (exception[2].equals("(Отказано")) {
                System.out.println("Ошибка прав доступа на файл");
            } else {
                if (exception[2].equals("(Не")) {
                    System.out.println("Не удается найти файл, проверьте что файл существует");
                } else {
                    if (exception[2].equals("(Системе")) {
                        System.out.println("Системе не удается найти указанный путь");
                    }
                }
            }
            */

        }
    }
}
