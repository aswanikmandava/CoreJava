package src.collectionframework.copyonwritearraylist;

import java.util.List;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/*
The ArrayList and LinkedList data structures are not thread-safe. This means that if we are working
in an environment where multiple threads are simultaneously adding or removing elements from a list,
it may not work as intended. If a thread is iterating over a list and, in the meantime, another thread
tries to add an element to the list, then ConcurrentModificationException will be thrown.

We can make our list thread-safe by using the Collections.synchronizedList() method. The problem with
this method is that it also locks the entire list for each operation. So, there is no performance benefit.

To overcome these issues CopyOnWriteArrayList was introduced. This is a thread-safe list with high
performance.
 */
public class CopyOnWriteListDemo {
    public static void main(String[] args) {
        List<String> fruits = new CopyOnWriteArrayList<>();
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Kiwi");

        Iterator<String> i = fruits.iterator();
        // adding element now will not throw ConcurrentModificationException
        fruits.add("Watermelon");

        // iterating over the list, watermelon won't be shown
        while(i.hasNext()) {
            String mFruit = i.next();
            if (mFruit.equals("Mango")) {
                System.out.println("Mango is removed");
                fruits.remove(mFruit);
            }
            System.out.println("Fruit: " + mFruit);
        }

        // iterate again will show watermelon
        for(String f:fruits) {
            System.out.println("Fruit: " + f);
        }
    }

}
