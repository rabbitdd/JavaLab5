package commands;

import java.util.ArrayDeque;
/**
 * Класс команды  info (информация о коллекции)
 * @author Мишанин Никита
 */
public class Info implements Command {
    Collection Humanity;
    ArrayDeque People;
    public Info(Collection Humanity, ArrayDeque People) {
        this.Humanity = Humanity;
        this.People = People;
    }

    @Override
    public void execute(String[] args) {
        Humanity.info(People);
    }
}
