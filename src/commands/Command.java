package commands;

import java.io.IOException;
/**
 * Интерфейс Command, служит для шаблона проектирования "Команда"
 * @author Мишанин Никита
 */
public interface Command {
    void execute(String[] args) throws IOException;
}
