class Node {
  int value;
  Node next;
  Node(int value) { this.value = value;}
}

public class Problem0402 {

  public Node partition(Node head, int value) {
    Node beforeHead = null, beforeTail = null;
    Node afterHead = null, afterTail = null;

    while (head != null) {
      Node next = head.next;
      head.next = null;

      if (head.value < value) {
        if (beforeHead == null) {
          beforeHead = head;
          beforeTail = head;
        } else {
          beforeTail.next = head;
          beforeTail = beforeTail.next;
        }
      } else {
        if (afterHead == null) {
          afterHead = head;
          afterTail = head;
        } else {
          afterTail.next = head;
          afterTail = afterTail.next;
        }
      }

      head = next;
    }

    if (beforeHead == null)
      return afterHead;

    beforeTail.next = afterHead;
    return beforeHead;
  }

}
