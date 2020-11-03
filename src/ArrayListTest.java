import javax.sound.midi.SoundbankResource;
import java.awt.desktop.PrintFilesEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("one");
        list.add("second");
        list.add("3rd");
        list.add(new Integer(4));
        list.add(new Float(5.0f));
        list.add("second");
        list.add(new Integer(4));
        list.add("M");
        list.add("A");
        list.remove(3);
        System.out.println(list);
        int i = list.indexOf("3rd");
        System.out.println("3rd ada di indeks ke-"+i);
        for (int a=0; a<list.size(); a++){
            System.out.println("ArrayList-"+a+" : "+list.get(a));
        }
        System.out.println("Before sort:" + list);
        Collections.sort(list);


    }
}
