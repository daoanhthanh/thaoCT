package lectures.collection.linkedList;

public class LinkedList {

  public Node head;

  public void insert(int data) {
    Node new_node = new Node(data);
    new_node.next = null;

    if (this.head == null) {
      this.head = new_node;
    } else {
      Node last = this.head;
      while (last.next != null) {
        last = last.next;
      }
      last.next = new_node;
    }
  }

  public String toString() {
    Node currNode = this.head;

    String sb = "[";

    while (currNode != null) {

      sb += " " + currNode.data + " ";

      currNode = currNode.next;
    }

    return sb + "]";
  }

}
