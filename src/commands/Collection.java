package commands;

import Parser.Parser;
import main.Application;
import main.HumanBeing;
import java.io.*;
import java.util.*;

import static Data.Sources.path_out;
/**
 * Класс collection (Здесь находится реализация всех команд)
 * @author Мишанин Никита
 */
public class Collection {
    public void help() {
        //String separator = File.separator;
        try {
            ///home/s284694/JavaLab5/Data/help.txt"
            File Help = new File("/home/s284694/JavaLab5/Data/help.txt/");
            BufferedReader fin = new BufferedReader(new FileReader(Help));
            String line;
            while ((line = fin.readLine()) != null)
                System.out.println(line);
            System.out.println();
        } catch (java.lang.Exception e) {
            //e.printStackTrace();
            String[] exception = e.toString().split(" ");
            //for (String n: exception) {
              //  System.out.println(n);
            //}
            if (exception[2].equals("(Отказано")) {
                System.out.println("Ошибка прав доступа на файл");
            } else {
                if (exception[2].equals("(Не")) {
                    System.out.println("Не удается найти файл, проверьте что файл существует");
                } else {
                    if (exception[2].equals("(Системе")) {
                        System.out.println("Системе не удается найти указанный путь");
                    }
                }
            }
        }
    }

    public void info(ArrayDeque<HumanBeing> People) {
        System.out.println("Тип коллекции: " + "HumanBeing" + "\n" + "" +
                        "Размер: " + People.size());
    }

    public void show(ArrayDeque<HumanBeing> People) {
        if (People.isEmpty())
            System.out.println("Коллекция пуста");
        else
            for (HumanBeing Man : People)
                System.out.println("Элемент коллекции: " + Man.getName() + " " + Man.getId() + " " + Man.getImpactSpeed());
    }

    public void add(ArrayDeque<HumanBeing> People, HashSet<Long> ID, String[] args) {
        Filler fill = new Filler(ID);
        HumanBeing Element = new HumanBeing();
        if (args.length > 1) {
            Element.setId(fill.fillId((long) 3));
            Element.setName(fill.fillName(args[1]));
            Element.setCoordinates(fill.fillCoordinates(args[2], args[3]));
            Element.setCreationDate(fill.fillDate());
            Element.setRealHero(fill.isHero(args[4]));
            Element.setHasToothpick(fill.tooth(args[5]));
            Element.setImpactSpeed(fill.fillSpeed(args[6]));
            Element.setWeaponType(fill.fillWeapon(args[7]));
            Element.setMood(fill.fillMood(args[8]));
            Element.setCar(fill.isCoolCar(args[9]));
        } else {
            Element.setId(fill.fillId((long) 3));
            Element.setName(fill.fillName(""));
            Element.setCoordinates(fill.fillCoordinates("", ""));
            Element.setCreationDate(fill.fillDate());
            Element.setRealHero(fill.isHero(""));
            Element.setHasToothpick(fill.tooth(""));
            Element.setImpactSpeed(fill.fillSpeed(""));
            Element.setWeaponType(fill.fillWeapon(""));
            Element.setMood(fill.fillMood(""));
            Element.setCar(fill.isCoolCar(""));
        }
        People.add(Element);
        System.out.println("Элемент добавлен");
    }

    public void clear(ArrayDeque<HumanBeing> People) {
        People.clear();
    }

    public void head(ArrayDeque<HumanBeing> People) {
        try {
            System.out.println(People.getFirst().getName() + " " + People.getFirst().getId());
        } catch (NoSuchElementException e) {
            System.out.println("Ошибка! В коллекции нет ни единого элемента, сначала нужно что-то туда добавить");
        }
    }

    public void exit() {
        System.out.println("Вы действительно хотите выйти не сохранив коллекцию ? (Да / Нет)");
        Scanner in = new Scanner(System.in);
        String ans = in.nextLine();
        if (ans.equalsIgnoreCase("Да"))
            System.exit(0);
        else
            System.out.println("Чтобы сохраниться, воспользуйтесь командой \"save\"");
    }

    public void remove_head(ArrayDeque<HumanBeing> People) {
        //System.out.println(People.getFirst().getName() + " " + People.getFirst().getId());
        try {
            HumanBeing Human = People.poll();
            assert Human != null;
            System.out.println(Human.getName() + " " + Human.getId());
        } catch (NullPointerException e) {
            System.out.println("Ошибка! Вы не можете удалить элемент из головы, так как коллекция пуста, сначала добавьте что-то туда");
        }
    }

    public void filter_starts_with_name(ArrayDeque<HumanBeing> People, String name) {
        boolean wrong = true;
        for (HumanBeing Human : People) {
            if (Human.getName().lastIndexOf(name) != -1) {
                System.out.println(Human.getName() + " " + Human.getId() + " " + Human.getImpactSpeed() + " " + Human.getCoordinates());
                wrong = false;
                break;
            }
        }
        if(wrong)
            System.out.println("Такого объекта не существует");

    }

    public void update_id(ArrayDeque<HumanBeing> People, HashSet<Long> ID, Long id, String[] args) {
        boolean wrong = true;
        for (HumanBeing Human : People)
            if (Human.getId().equals(id)) {
                Filler fill = new Filler(ID);
                if (args.length > 2) {
                    Human.setId(fill.fillId((long) 3));
                    Human.setName(fill.fillName(args[2]));
                    Human.setCoordinates(fill.fillCoordinates(args[3], args[4]));
                    Human.setCreationDate(fill.fillDate());
                    Human.setRealHero(fill.isHero(args[5]));
                    Human.setHasToothpick(fill.tooth(args[6]));
                    Human.setImpactSpeed(fill.fillSpeed(args[7]));
                    Human.setWeaponType(fill.fillWeapon(args[8]));
                    Human.setMood(fill.fillMood(args[9]));
                    Human.setCar(fill.isCoolCar(args[10]));
                } else {
                    Human.setId(fill.fillId((long) 3));
                    Human.setName(fill.fillName(""));
                    Human.setCoordinates(fill.fillCoordinates("", ""));
                    Human.setCreationDate(fill.fillDate());
                    Human.setRealHero(fill.isHero(""));
                    Human.setHasToothpick(fill.tooth(""));
                    Human.setImpactSpeed(fill.fillSpeed(""));
                    Human.setWeaponType(fill.fillWeapon(""));
                    Human.setMood(fill.fillMood(""));
                    Human.setCar(fill.isCoolCar(""));
                }
                System.out.println("Элемент с ID = " + id + " обновлен");
                wrong = false;
                break;
            }
        if (wrong)
            System.out.println("Объекта с таким ID не существует");
    }

    public void save(ArrayDeque<HumanBeing> People) throws IOException {
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(path_out));
        output.write(Parser.parsToJson(People));
        output.close();
    }

    public void remove_by_id(ArrayDeque<HumanBeing> People, int id) {
        ArrayDeque<HumanBeing> a = new ArrayDeque();
        boolean wrong = false;
        for (HumanBeing Human : People) {
            if (Human.getId() != id) {
                a.add(Human);
            } else {
                wrong = true;
            }
        }
        if(!wrong)
            System.out.println("Элемента с таким ID нет");
        People.clear();
        People.addAll(a);
    }

    public void add_if_min(ArrayDeque<HumanBeing> People, HashSet<Long> ID, String[] args) {
        int min = 1001;
        Filler fill = new Filler(ID);
        HumanBeing Element = new HumanBeing();
        if (args.length > 1) {
            Element.setId(fill.fillId((long) 3));
            Element.setName(fill.fillName(args[1]));
            Element.setCoordinates(fill.fillCoordinates(args[2], args[3]));
            Element.setCreationDate(fill.fillDate());
            Element.setRealHero(fill.isHero(args[4]));
            Element.setHasToothpick(fill.tooth(args[5]));
            Element.setImpactSpeed(fill.fillSpeed(args[6]));
            Element.setWeaponType(fill.fillWeapon(args[7]));
            Element.setMood(fill.fillMood(args[8]));
            Element.setCar(fill.isCoolCar(args[9]));
        } else {
            Element.setId(fill.fillId((long) 3));
            Element.setName(fill.fillName(""));
            Element.setCoordinates(fill.fillCoordinates("", ""));
            Element.setCreationDate(fill.fillDate());
            Element.setRealHero(fill.isHero(""));
            Element.setHasToothpick(fill.tooth(""));
            Element.setImpactSpeed(fill.fillSpeed(""));
            Element.setWeaponType(fill.fillWeapon(""));
            Element.setMood(fill.fillMood(""));
            Element.setCar(fill.isCoolCar(""));
        }
        for (HumanBeing Human : People) {
            if (Human.getImpactSpeed() < min)
                min = Human.getImpactSpeed();
        }
        if (Element.getImpactSpeed() < min) {
            People.add(Element);
            System.out.println("Элемент добавлен");
        }
        else {
            System.out.println("Значение скорости для этого элемента оказалось не наименьшим, он не был добавлен :(");
        }

    }

    public void print_descending(ArrayDeque<HumanBeing> People, ArrayList<HumanBeing> SortList) {
        //ArrayList<HumanBeing> = new ArrayList<HumanBeing>();
        SortList.addAll(People);
        SortList.sort(new Comparator<HumanBeing>() {
            @Override
            public int compare(HumanBeing o1, HumanBeing o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Элементы колекции в порядке убывания: Обратный Алфавитный по имени:");
        for (int i = SortList.size() - 1; i >= 0; i--)
            System.out.println("Имя: " + SortList.get(i).getName() + "\nID: " + SortList.get(i).getId() + "\nОружие: " +
                    SortList.get(i).getWeaponType() + "\n");
        SortList.clear();
    }

    public void print_field_ascending_mood(ArrayDeque<HumanBeing> People, ArrayList<HumanBeing> Mood) {
        Mood.addAll(People);
        Mood.sort(new Comparator<HumanBeing>() {
            @Override
            public int compare(HumanBeing o1, HumanBeing o2) {
                return o1.getMood().compareTo(o2.getMood());
            }
        });
        System.out.println("Поля Mood в порядке возрастания:");
        for (HumanBeing Human : Mood)
            System.out.println("Имя: " + Human.getName() + "\nMood: " + Human.getMood() + "\n");
        Mood.clear();
    }
    public void execute_script(String path, HashSet<String> set) throws IOException {
        //System.out.println(path);
        //File file = new File("E:" + File.separator + "aaa.txt");
        //System.out.println(path);
        FileInputStream file = new FileInputStream(new File(path));
        Scanner input = new Scanner(file);
        //HashSet<String> a = new HashSet<>();
        set.add(path);
        //System.out.println("Зашел в метод");
        //System.out.println(in);
        while (input.hasNextLine()) {
            String[] arg = input.nextLine().split(" ");
            if (arg[0].equals("execute_script")) {
                if (!set.contains(arg[1])) {
                    set.add(arg[1]);
                    Application.runForScript(arg, set);
                }
                else {
                    System.out.println("Скрипт содержит сам себя !");
                }
            } else {
                Application.runForScript(arg, set);
            }
        }
    }
}

