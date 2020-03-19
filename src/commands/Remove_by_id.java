package commands;

import main.HumanBeing;

import java.io.IOException;
import java.util.ArrayDeque;
/**
 * Класс команды remove_by_id (удаление по id)
 * @author Мишанин Никита
 */
public class Remove_by_id implements Command {

    Collection Humanity;
    ArrayDeque<HumanBeing> People;
    public Remove_by_id(Collection Humanity, ArrayDeque People) {
        this.Humanity = Humanity;
        this.People = People;
    }
    @Override
    public void execute(String[] args) {
        int id = Integer.parseInt(args[1]);
        Humanity.remove_by_id(People, id);
    }
}
