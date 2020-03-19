package commands;

import main.HumanBeing;

import java.util.ArrayDeque;
import java.util.HashSet;
/**
 * Класс команды add_if_min (Добавить новый элемент если его значение меньше минимального в коллекции)
 * @author Мишанин Никита
 */
public class Add_if_min implements Command{

    Collection Humanity;
    ArrayDeque<HumanBeing> People;
    HashSet ID;
    public Add_if_min(Collection Humanity, ArrayDeque People, HashSet ID) {
        this.Humanity = Humanity;
        this.People = People;
        this.ID = ID;
    }

    @Override
    public void execute(String[] args) {
        System.out.println(args);
        Humanity.add_if_min(People, ID, args);
    }
}
