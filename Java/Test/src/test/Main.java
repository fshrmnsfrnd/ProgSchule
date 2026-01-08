package test;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> zahlen = new LinkedList<>();
        zahlen.add(3);
        zahlen.add(1);
        zahlen.add(2);
        
        Iterator<Integer> it = zahlen.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
