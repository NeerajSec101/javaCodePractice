package LinkedListExamples;

import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        /*Vector v = new Vector();
        System.out.println(v.capacity());
        for(int i=1;i<=10;i++){
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement("A");
        System.out.println(v.capacity());;
        System.out.println(v);*/

        Stack s = new Stack();
        s.push("a");
        s.push("b");
        s.push("c");
        s.push("d");
        s.push("e");
        System.out.println(s.peek());
        System.out.println(s.search("a"));
        System.out.println(s.search("z"));

    }
}
