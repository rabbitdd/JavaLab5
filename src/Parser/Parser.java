package Parser;

import Data.Sources;
import main.HumanBeing;
import java.util.ArrayDeque;
/**
 * Класс Parser
 * @author Мишанин Никита
 */
public class Parser implements Sources {

    public static byte[] parsToJson(ArrayDeque<HumanBeing> Humanity) {
        String json = GSON.toJson(Humanity);
        byte[] buffer = json.getBytes();
        return buffer;
    }
}
