package commands;

import java.util.ArrayDeque;
/**
 * Класс команды show (вывод информации о коллекции)
 * @author Мишанин Никита
 */
public class Show implements Command {

    Collection Humanity;
    ArrayDeque People;
    public Show(Collection Humanity, ArrayDeque People) {
        this.Humanity = Humanity;
        this.People = People;
    }

    @Override
    public void execute(String[] args) {
        Humanity.show(People);
    }
}
