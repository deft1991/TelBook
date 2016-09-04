import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by deft on 04.09.2016.
 */
public class TelBook {
    public static HashMap<String, ArrayList<String>> telB = new HashMap<String, ArrayList<String>>();

    public static void main(String[] args) {
        addALL();
        getData("tishenko");
        getData("sidorov");
    }

    public static void addALL() {
        ArrayList<String> buf = new ArrayList<String>();
        buf.add("+79040893604");
        buf.add("+79040893605");
        buf.add("+79040893606");
        addData("golitsyn", buf);
        buf.add("+79856663211");
        addData("mishenin", buf);
        buf.add("+79102345678");
        buf.add("+79102345699");
        addData("tishenko", buf);
        buf.add("+79998887766");
        addData("sivtsev", buf);
        buf.add("+79090007712");
        addData("duyun", buf);
    }

    public static void addData(String name, ArrayList<String> nums) {
        if (name == null) {
            System.out.println("не корректные данные");
        }
        telB.put(name, (ArrayList<String>) nums.clone());
        nums.clear();
    }

    public static void getData(String name) {
        if (name == null) {
            System.out.println("не коректные данные");
            return;
        }
        if (!telB.containsKey(name)) {
            System.out.println("Такого имени нет в БД!");
            return;
        }
        ArrayList<String> list = telB.get(name);
        for (String s : list)
            System.out.println(s);
        // если используем Java 8
        //telB.get(name).forEach(value -> System.out.println(value));
    }
}
