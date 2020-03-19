package commands;

import main.HumanBeing;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashSet;
/**
 * Класс команды update_id (Обновить значения полей с заданным id)
 * @author Мишанин Никита
 */
public class Update_id implements Command {
    Collection Humanity;
    ArrayDeque<HumanBeing> People;
    HashSet<Long> ID;

    public Update_id(Collection Humanity, ArrayDeque<HumanBeing> People, HashSet<Long> ID) {
        this.Humanity = Humanity;
        this.People = People;
        this.ID = ID;
    }


    @Override
    public void execute(String[] args) {
        try {
            Long id = Long.parseLong(args[1]);
            Humanity.update_id(People, ID, id, args);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не числовое значение");
        }
    }
}
