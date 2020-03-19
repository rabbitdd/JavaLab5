package commands;

import main.HumanBeing;

import java.io.IOException;
import java.util.ArrayDeque;
/**
 * Класс команды remove_head (вывод первого элемента с головы и его удаление)
 * @author Мишанин Никита
 */
public class Remove_head implements Command {
    Collection Humanity;
    ArrayDeque<HumanBeing> People;
    public Remove_head(Collection Humanity, ArrayDeque<HumanBeing> People) {
        this.Humanity = Humanity;
        this.People = People;
    }

    @Override
    public void execute(String[] args) throws IOException {
        Humanity.remove_head(People);
    }
}
