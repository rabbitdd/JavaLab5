package commands;

import main.HumanBeing;

import java.io.IOException;
import java.util.ArrayDeque;
/**
 * Класс команды  Head (Вывод элемента с головы)
 * @author Мишанин Никита
 */
public class Head implements Command {
    Collection Humanity;
    ArrayDeque People;
    public Head(Collection Humanity, ArrayDeque People) {
        this.Humanity = Humanity;
        this.People = People;
    }
    @Override
    public void execute(String[] args)  {
        Humanity.head(People);
    }
}
