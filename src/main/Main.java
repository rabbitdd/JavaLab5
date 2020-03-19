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
        } catch (Exception e) {
            String[] exception = e.toString().split(" ");
            //System.out.println(e.getCause().toString());
            if (e.getCause() == null) {
                System.out.println(e.toString());
                System.out.println("Ошибка, неверно задана перменная среда, задайте правильный путь с помощью команды export ИМЯ = \"ПУТЬ\"");
            }
        }
    }
}
