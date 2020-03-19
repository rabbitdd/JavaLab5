package commands;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
/**
 * Класс команды Print_field_ascending_mood (вывод полей Mood в отсортированом порядке)
 * @author Мишанин Никита
 */
public class Print_field_ascending_mood implements Command {
    Collection Humanity;
    ArrayDeque People;
    ArrayList Mood;

    public Print_field_ascending_mood(Collection Humanity, ArrayDeque People, ArrayList Mood) {
        this.Humanity = Humanity;
        this.People = People;
        this.Mood = Mood;
    }

    @Override
    public void execute(String[] args) {
        Humanity.print_field_ascending_mood(People, Mood);
    }
}
