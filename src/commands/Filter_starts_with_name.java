package commands;

import main.HumanBeing;
import sun.net.www.protocol.https.HttpsURLConnectionImpl;

import java.io.IOException;
import java.util.ArrayDeque;
/**
 * Класс команды  Filter_starts_with_name (Фильтрация по подстроке)
 * @author Мишанин Никита
 */
public class Filter_starts_with_name implements Command{
    Collection Humanity;
    ArrayDeque<HumanBeing> People;

    public Filter_starts_with_name(Collection Humanity, ArrayDeque<HumanBeing> People) {
        this.Humanity = Humanity;
        this.People = People;
    }

    @Override
    public void execute(String[] args) {
        System.out.println(args);
        Humanity.filter_starts_with_name(People, args[1]);
    }
}
