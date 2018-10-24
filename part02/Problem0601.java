class Node {
  int value;
  Node next;
  Node(int value) { this.value = value;}
}

public class Problem0601 {

  public boolean isPalindrome(Node head) {
    Node newHead = null;
    Node p = head;

    while (p != null) {
      Node node = new Node(p.value);

      node.next = newHead;
      newHead = node;
      p = p.next;
    }

    while (head != null) {
      if (head.value != newHead.value)
        return false;

      head = head.next;
      newHead = newHead.next;
    }

    return true;
  }

}
