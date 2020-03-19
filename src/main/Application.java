package main;

import Data.Sources;
import commands.Add;
import commands.Collection;
import commands.Remove_by_id;
import commands.Remove_head;
import commands.Save;

import java.io.*;
import java.util.*;

import commands.*;
/**
 * Класс запуска приложения
 * @author Мишанин Никита
 */
public class Application implements Sources {
    // BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path_in));
    //BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(path_out));
    //Reader jsonReader = new InputStreamReader(bufferedInputStream);
    static Collection collection;
    static HumanBeing Human;
    static ArrayDeque <HumanBeing> Humanity;
    static HashSet <Long> ID;
    static ArrayList<HumanBeing> SortList;
    static FileReader in;
    HashSet<String> set;




    public Application(Collection collection, ArrayDeque<HumanBeing> Humanity, HumanBeing Human, HashSet<Long> ID, ArrayList SortList,
                       HashSet<String> set) throws FileNotFoundException {
        this.collection = collection;
        this.Humanity = Humanity;
        this.Human = Human;
        this.ID = ID;
        this.SortList = SortList;
        this.set = set;
    }

    public void runApp() throws IOException {
        HashSet<String> set = new HashSet<>();
        System.out.println("Привет ! Это мое приложение для работы с коллекцией, " +
                "чтобы просмотреть все доступные команды воспользуйся командой \"help\"");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите команду: ");
        String[] args = in.nextLine().split(" ");
        User user = new User(new Info(collection, Humanity), new Show(collection, Humanity), new Help(collection), new
                Add(collection, Humanity, Human, ID), new Clear(collection, Humanity), new Head(collection, Humanity),
                new Exit(collection), new Remove_head(collection, Humanity), new Filter_starts_with_name(collection, Humanity),
                new Update_id(collection, Humanity, ID),
                new Save(collection, Humanity), new Remove_by_id(collection, Humanity),
                new Add_if_min(collection, Humanity, ID), new Print_descending(collection, Humanity, SortList)
        , new Print_field_ascending_mood(collection, Humanity, SortList), new Execute_script(collection, set));
        while (true) {
            //flag = false;
            switch (args[0]) {
                case "help": user.helpRecord(args); break;
                case "info": user.infoRecord(args); break;
                case "show": user.showRecord(args); break;
                case "add": user.addRecord(args); break;
                case "update_id": user.update_idRecord(args); break;
                case "remove_by_id": user.remove_by_idRecord(args); break;
                case "clear": user.clearRecord(args); break;
                case "save": user.saveRecord(args); break;
                case "exit": user.exitRecord(args); break;
                case "head": user.headRecord(args); break;
                case "remove_head": user.remove_headRecord(args); break;
                case "add_if_min": user.add_if_minRecord(args); break;
                case "filter_starts_with_name": user.filter_start_with_nameRecord(args); break;
                case "print_descending": user.print_descendingRecord(args); break;
                case "print_field_ascending_mood": user.print_field_ascending_moodRecord(args); break;
                case "execute_script": user.execute_scriptRecord(args); break;
                    //user.execute_scriptRecord(args); break;
                default:
                    System.out.println("Такой команды не существует, воспользуйтесь командой \"help\" чтобы " +
                            "посмотреть действующие команды.");
            }
            System.out.print("Введите команду: ");
            args = in.nextLine().split(" ");

        }
    }

    public static void runForScript(String[] args, HashSet<String> set) throws IOException {
        //Stack<String> scripts = new Stack<>();
        //HashSet<String> set = new HashSet<>();
        User user = new User(new Info(collection, Humanity), new Show(collection, Humanity), new Help(collection), new
                Add(collection, Humanity, Human, ID), new Clear(collection, Humanity), new Head(collection, Humanity),
                new Exit(collection), new Remove_head(collection, Humanity), new Filter_starts_with_name(collection, Humanity),
                new Update_id(collection, Humanity, ID),
                new Save(collection, Humanity), new Remove_by_id(collection, Humanity),
                new Add_if_min(collection, Humanity, ID), new Print_descending(collection, Humanity, SortList)
                , new Print_field_ascending_mood(collection, Humanity, SortList), new Execute_script(collection, set));
        switch (args[0]) {
            case "help": user.helpRecord(args); break;
            case "info": user.infoRecord(args); break;
            case "show": user.showRecord(args); break;
            case "add": user.addRecord(args); break;
            case "update_id": user.update_idRecord(args); break;
            case "remove_by_id": user.remove_by_idRecord(args); break;
            case "clear": user.clearRecord(args); break;
            case "save": user.saveRecord(args); break;
            case "exit": user.exitRecord(args); break;
            case "head": user.headRecord(args); break;
            case "remove_head": user.remove_headRecord(args); break;
            case "add_if_min": user.add_if_minRecord(args); break;
            case "filter_starts_with_name": user.filter_start_with_nameRecord(args); break;
            case "print_descending": user.print_descendingRecord(args); break;
            case "print_field_ascending_mood": user.print_field_ascending_moodRecord(args); break;
            case "execute_script":  user.execute_scriptRecord(args); break;
            //user.execute_scriptRecord(args); break;
            default:
                System.out.println("Такой команды не существует, воспользуйтесь командой \"help\" чтобы " +
                        "посмотреть действующие команды.");
        }
        //in.close();
    }


}
