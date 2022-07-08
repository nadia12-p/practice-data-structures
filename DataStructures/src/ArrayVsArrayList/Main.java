package ArrayVsArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Create
        String[] friendsArray = {"John", "Chris", "Eric", "Luke"};
        ArrayList<String> friendsArrayList =
                new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));

        //Get an element
        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList.get(1));

        //Getting size of array
        System.out.println(friendsArray.length); //field
        System.out.println(friendsArrayList.size()); //method call

        //Adding elements at the end of the array
        //You can't add elements at the end of an array -> arrays have fix size
        friendsArrayList.add("Mitch");
        System.out.println(friendsArrayList.get(4));

        //Set an element
        friendsArray[0] = "Carl";
        System.out.println(friendsArray[0]);
        friendsArrayList.set(0, "Carl");
        System.out.println(friendsArrayList.get(0));

        //Removing an element
        //Can't do it with arrays (FIXED SIZE), can't change size
        friendsArrayList.remove("Chris");
        System.out.println(friendsArrayList.get(1)); //New arrayList -> John, Eric, Luke

        //Print
        //array if you -> System.out.println(friendsArray); -> java will give you the
        //memory address of that array
        for (int i=0; i < friendsArray.length; i++) {
            System.out.println(friendsArray[i]);
        }
        System.out.println(friendsArrayList); //can print entire list

    }
}