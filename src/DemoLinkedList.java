import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Sepeda");
        linkedList.add("Baju");
        linkedList.add("Bola");
        linkedList.add("Sandal");
        linkedList.add("Topi");
        linkedList.addLast("Sepatu");
        linkedList.addFirst("Jaket");
        linkedList.add(1,"Laptop");

        System.out.println("Isi awal linkedlist" + linkedList);
        System.out.println("Data linked list yang paling akhir = " + linkedList.getLast());

        linkedList.remove("Topi");
        linkedList.remove(2);
        System.out.println("Isi LinkedList setelah dihapus "+ linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Isi linked list setelah di hapus depan dan belakang" + linkedList);

        for (int i =0; i < linkedList.size(); i++){
            System.out.println("LinkedList ke-"+i+" : "+ linkedList.get(i));
        }



    }
}
