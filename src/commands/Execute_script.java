package commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;
/**
 * Класс команды execute_script (Выполнение программы из скрипта)
 * @author Мишанин Никита
 */
public class Execute_script implements Command{

    //Scanner in;
    Collection Humanity;
    Stack scripts;
    HashSet set;

    public Execute_script(Collection Humanity, HashSet<String> set) throws FileNotFoundException {
        //this.in = in;
        this.Humanity = Humanity;
        this.set = set;
        //this.scripts = scripts;
    }

    @Override
    public void execute(String[] args) {
        try {
            Humanity.execute_script(args[1], set);
        } catch (IOException e) {
            System.out.println("Ошибка, файл не найден и будет создан!");
            try {
                File file = new File("/home/s284694/JavaLab5/" + File.separator + args[1]);
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println("В программе указан неверный путь");
                //ex.printStackTrace();
            }
        }
    }
}
