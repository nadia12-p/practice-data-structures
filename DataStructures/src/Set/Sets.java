package Set;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args){
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        // balls.add(new Ball(color("blue)); <- will be rejected
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        //balls.get doesn't exist, can't get particular ball
        balls.forEach(System.out::println); //order not guarantee
    }

    record Ball(String color){}
    //he overwrote some things, watch videos again https://www.youtube.com/watch?v=8MmMm2-kJV8
}


/*A collection that contains NO duplicate elements.

It's like a bag, you can't guarantee order.

More formally, sets contain no pair of elements e1 and e2
such that e1.equals(e2), and at most one null element

As implied by its name, this interface models the
mathematical set abstraction
 */