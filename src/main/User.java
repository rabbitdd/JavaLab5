package main;

//import commands.Command;
import commands.Command;

import java.io.IOException;
/**
 * Класс User
 * @author Мишанин Никита
 */
public class User {

   Command info, show, help, add, clear, head, exit, remove_head, filter_start_with_name, update_id,
            save, remove_by_id, add_if_min, print_descending, print_field_ascending_mood, execute_script;
    public User(Command info, Command show, Command help, Command add, Command clear,
                Command head, Command exit, Command remove_head, Command filter_start_with_name,
                Command update_id, Command save, Command remove_by_id,
                Command add_if_min, Command print_descending, Command print_field_ascending_mood,
                Command execute_script) {
        this.info = info;
        this.show = show;
        this.help = help;
        this.add = add;
        this.clear = clear;
        this.head = head;
        this.exit = exit;
        this.remove_head = remove_head;
        this.filter_start_with_name = filter_start_with_name;
        this.update_id = update_id;
        this.save = save;
        this.remove_by_id = remove_by_id;
        this.add_if_min = add_if_min;
        this.print_descending = print_descending;
        this.print_field_ascending_mood = print_field_ascending_mood;
        this.execute_script = execute_script;

    }
    public void helpRecord(String[] args) throws IOException {
        help.execute(args);
    }
    public void infoRecord(String[] args) throws IOException {
        info.execute(args);
    }

    public void showRecord(String[] args) throws IOException {
        show.execute(args);
    }
    public void addRecord(String[] args) throws IOException {
        add.execute(args);
    }

    public void clearRecord(String[] args) throws IOException {
        clear.execute(args);
    }

    public void headRecord(String[] args) throws IOException {
        head.execute(args);
    }

    public void exitRecord(String[] args) throws IOException {
        exit.execute(args);
    }

    public void remove_headRecord(String[] args) throws IOException {
        remove_head.execute(args);
    }

    public void filter_start_with_nameRecord(String[] args) throws IOException {
        filter_start_with_name.execute(args);
    }

    public void update_idRecord(String[] args) throws IOException {
        update_id.execute(args);
    }

    public void saveRecord(String[] args) throws IOException {
        save.execute(args);
    }

    public void remove_by_idRecord(String[] args) throws IOException {
        remove_by_id.execute(args);
    }

    public void add_if_minRecord(String[] args) throws IOException {
        add_if_min.execute(args);
    }

    public void print_descendingRecord(String[] args) throws IOException {
        print_descending.execute(args);
    }

    public void print_field_ascending_moodRecord(String[] args) throws IOException {
        print_field_ascending_mood.execute(args);
    }

    public void execute_scriptRecord(String[] args) throws IOException {
        execute_script.execute(args);
    }

}
