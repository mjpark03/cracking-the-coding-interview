class Node {
  int value;
  Node next;
  Node(int value) { this.value = value;}
}

public class Problem0403 {

  public Node partition(Node head, int value) {
    Node newHead = head, newTail = head;

    while (head != null) {
      Node next = head.next;

      if (head.value < value) {
        head.next = newHead;
        newHead = head;
      } else {
        newTail.next = head;
        newTail = newTail.next;
      }

      head = next;
    }

    newTail.next = null;
    return newHead;
  }

}
