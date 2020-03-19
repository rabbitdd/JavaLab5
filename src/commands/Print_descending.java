package commands;

import main.HumanBeing;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
/**
 * Класс команды  Print_descending (вывод коллекции в отсортированом порядке)
 * @author Мишанин Никита
 */
public class Print_descending implements Command {
    Collection Humanity;
    ArrayDeque People;
    ArrayList<HumanBeing> SortList;

    public Print_descending(Collection Humanity, ArrayDeque People, ArrayList<HumanBeing> SortList) {
        this.Humanity = Humanity;
        this.People = People;
        this.SortList = SortList;
    }

    @Override
    public void execute(String[] args) throws IOException {
        Humanity.print_descending(People, SortList);
    }
}
