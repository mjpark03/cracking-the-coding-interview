class Node {
  int value;
  Node next;
  Node(int value) { this.value = value;}
}

public class Problem0802 {

  public Node findLoopStart(Node head) {
    Node slow = head, fast = head;

    while (true) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast)
        break;
    }

    slow = head;
    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }

    return fast;
  }

}
