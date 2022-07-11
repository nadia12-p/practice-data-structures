package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args){

        Queue<Person> supermaket = new LinkedList<>();
        supermaket.add(new Person("Alex",21));
        supermaket.add(new Person("Mariam",18));
        supermaket.add(new Person("Ali",40));
        System.out.println(supermaket.size());
        System.out.println(supermaket.peek());
        System.out.println(supermaket.poll());
        System.out.println(supermaket.size());
        System.out.println(supermaket.peek());


    }

    static record Person(String name, int age) {}

}

