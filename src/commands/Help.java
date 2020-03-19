package commands;

import java.io.IOException;
/**
 * Класс команды help (инструкция по командам)
 * @author Мишанин Никита
 */
public class Help implements Command {
    Collection Humanity;

    public Help(Collection Humanity) {
        this.Humanity = Humanity;
    }

    @Override
    public void execute(String[] args) throws IOException {
        Humanity.help();
    }
}
