package Data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
/**
 * Класс Интерфейса sources (хранение источников)
 * @author Мишанин Никита
 */
public interface Sources {
    Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    //String path1 = "/home/s284694/JavaLab5/Data/Input.json/";
    //String path2 = "/home/s284694/JavaLab5/Data/Output.json";
    String path_in = System.getenv().get("INPUT");
    String path_out = System.getenv().get("INPUT");
}
