package LinkedListExamples;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Neeraj");
        l.add("Sharma");
        l.add(null);
        l.add("Hacker");
        l.set(0,"Nik");
        l.add(0,"Neel");
        l.removeLast();
        l.addFirst("ccc");
        System.out.println(l);
    }
}
