package bai10.BT_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
//        MyLinkedList<Integer> linkerList = new MyLinkedList<>(1);
//        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.addFirst(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
//        linkedList.printList();
        linkedList.add(3,100);
//        linkedList.printList();
        System.out.println(linkedList.get(3));
        System.out.println("-----------");

        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


//        System.out.println("In List: ");
//        linkerList.printList();
//        System.out.println("Trả về phần tử thứ 2: ");
//        System.out.println(linkerList.remove(2));
//        linkerList.addFirst(10);
//        linkerList.addLast(11);
//        linkerList.add(2, 11);
//        System.out.println("In List sau khi thêm: ");
//        linkerList.printList();
//        System.out.println("Kiểm tra phần tử có hay khong: ");
//        System.out.println(linkerList.contains(12));
//        System.out.println("Trả về vị trí đầu tiên của phần tử: ");
//        System.out.println(linkerList.indexOf(11));
//        System.out.println("Trả về phần tử có hay không và xóa vị trí đầu tiên: ");
//        System.out.println(linkerList.remove1(11));
//        System.out.println("In List sau khi xóa: ");
//        linkerList.printList();
//        System.out.println("Trả về các phần tử: ");
//        System.out.println(linkerList.get(2));
//        System.out.println(linkerList.getFirst());
//        System.out.println(linkerList.getLast());
    }
}
