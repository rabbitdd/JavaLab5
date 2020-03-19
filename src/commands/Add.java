package commands;

import main.HumanBeing;

import java.util.ArrayDeque;
import java.util.HashSet;

/**
 * Класс команды add (Добавить новый элемент в коллекцию)
 * @author Мишанин Никита
 */
public class Add implements Command {
    Collection Humanity;
    ArrayDeque<HumanBeing> People;
    HumanBeing Element;
    HashSet<Long> ID;
    public Add(Collection Humanity, ArrayDeque<HumanBeing> People, HumanBeing Element, HashSet<Long> ID) {
        this.Humanity = Humanity;
        this.People = People;
        this.ID = ID;
        this.Element = Element;
    }
    @Override
    public void execute(String[] args) {
        //for (String s : args)
            //System.out.println(s);
        Humanity.add(People, ID, args);
    }
}
