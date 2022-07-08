package LinkedListExample;

import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");

        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        namesArrayList.add("Ringo");

        /*Classes are similar because they're part of java's collections
        framework and both implement the List Interface
        Because both arrayList and linkedList implement that list interface
        they both support the exact same list methods*/

        //Difference
        /* Implementation behind the scenes:
        -ArrayList
        -> uses array as an underline data structure
        -> 10 default size, when capacity reached new array is created
        -> data copied into that new array
        -> can take time and resources

        -LinkedList
        -> bunch of different elements (nodes) that reference to the next node
        -> doubly linked list -> actually linked list in java
        -> double/linked list -> next and prev node pointers
         */

        //Get an element
        System.out.println(namesLinkedList.get(2));
        System.out.println(namesArrayList.get(2));

        /*Same method called but what happens behind the scenes is different
        --array list
        -> uses an array to store values
        -> arrays have super fast random access
        -> this runs on constant time O(1)
        -> doesn't matter which index it is

        --linked list
        ->java only has reference to the head and tail values
        -> to get an element it has to follow the next and previous pointers
        -> 1000 list, get(400), much slower
         */

        //Add or remove element
        namesLinkedList.add(1,"Jerry"); //second place
        namesArrayList.add(1,"Jerry");

        /*
        --linked list
        ->start at beginning until get to value
        -> change reference for past node, future node (prev and next) and inserted node
        -> all the other links of the list stay the same
        -> remove same process, take out element and rewire references

        --array list
        -> create a whole new array large enough
        -> copy all existing entries on the right space
        -> takes new element and adds it in the desired place
        -> to remove elements you have to shift all values after it

        faster to remove and add elements on a linked list
        getting an element is faster on an array list
        if list is very small not much difference
        for large lists
        -if its static, array list best bet
        -no need to retrieve values, more important to add or remove things use linked list
         methods called are the same
         what's going on behind the scene is the difference
         */


    }
}
