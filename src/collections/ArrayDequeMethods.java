package collections;


import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class ArrayDequeMethods {
  public static void main(String... args) {
    var deck = new ArrayDeque<Integer>();

    // Methods to examine the head and tail
    System.out.println("Head: " + deck.peekFirst());
    System.out.println("Tail: " + deck.peekLast());
    try {
      // throws exception since the deque is empty
      System.out.println("Head: " + deck.getFirst());
      // System.out.println("Tail: " + deck.getLast());
    } catch(NoSuchElementException ex) {
      System.out.println("NoSuchElement");
    }


    // Methods to add to the head and tail
    deck.offerFirst(2);
    deck.addFirst(1); // May throw exception
    deck.offerLast(3);
    deck.addLast(4); // May throw exception

    System.out.println(deck);

    // Remove from the head and tail
    System.out.println("pollFirst(): " + deck.pollFirst());
    System.out.println("pollLast(): " + deck.pollLast());
    System.out.println("removeFirst(): " + deck.removeFirst());
    System.out.println("removeLast(): " + deck.removeLast());

    // Using the deque as a stack

    deck.push(3);
    deck.push(2);
    deck.push(1);
    System.out.println("Deque as a Stack: " + deck);
    System.out.println("peek(): " + deck.peek());
    System.out.println("pop(): " + deck.pop());

  }
}
