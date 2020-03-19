package commands;

import java.io.IOException;
import java.util.ArrayDeque;
/**
 * Класс команды save (сохранение коллекции в файл)
 * @author Мишанин Никита
 */
public class Save implements Command {
    Collection Humanity;
    ArrayDeque People;
    public Save(Collection Humanity, ArrayDeque People) {
        this.Humanity = Humanity;
        this.People = People;
    }
    @Override
    public void execute(String[] args) throws IOException {
        Humanity.save(People);
    }
}
