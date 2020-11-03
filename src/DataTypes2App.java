import java.util.ArrayList;
import java.util.List;

public class DataTypes2App {

    private static String change(String str) {
        str = "another text";
        System.out.println("Text in method=" + str);
        return str;
    }

    private static void addToList(List list, String str) {
        list.add(str);
        showList(list);
    }

    private static void showList(List list){
        System.out.println("List size = " + list.size());
        for (int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String val = "just a text";
        System.out.println("Text before=" + val);
        val = change(val);
        System.out.println("Text after=" + val);

        List list= new ArrayList();
        list.add("text 1");
        showList(list);
        addToList(list, "text 2");
        showList(list);
    }

}
