package commands;


import java.io.IOException;
import java.util.ArrayDeque;
/**
 * Класс команды clear (Очистка коллекции)
 * @author Мишанин Никита
 */
public class Clear implements Command{
    Collection Humanity;
    ArrayDeque People;
    public Clear(Collection Humanity, ArrayDeque People) {
        this.Humanity = Humanity;
        this.People = People;
    }
    @Override
    public void execute(String[] args) {
        Humanity.clear(People);
    }
}
