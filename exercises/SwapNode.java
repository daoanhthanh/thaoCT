package exercises;

import lectures.collection.linkedList.LinkedList;
import lectures.collection.linkedList.Node;

public class SwapNode {

  public static Node swapPairs(Node head) {
    if (head == null) {
      return head;
    }

    Node temp = new Node();

    Node first, second, prev = temp;

    prev.next = head;
    while (prev.next != null && prev.next.next != null) {
      first = prev.next;
      second = first.next;
      prev.next = second;
      first.next = second.next;
      prev = second.next = first;
    }
    
    return temp.next;
  }

  public static void main(String[] args) {

    LinkedList ll = new LinkedList();

    ll.insert(0);
    ll.insert(2);
    ll.insert(3);
    ll.insert(4);

    System.out.println(ll);

    ll.head = swapPairs(ll.head);

    System.out.println(ll);

  }
}
