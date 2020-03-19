package commands;

import java.io.IOException;
/**
 * Класс команды exit (Выход без сохранения)
 * @author Мишанин Никита
 */
public class Exit implements Command {
    Collection Humanity;

    public Exit(Collection Humanity) {
        this.Humanity = Humanity;
    }

    @Override
    public void execute(String[] args)  {
        Humanity.exit();
    }
}
