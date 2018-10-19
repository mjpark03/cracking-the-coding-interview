
class Node {
  int data;
  Node next;
  Node(int data) { this.data = data;}
}

public class Problem0201 {

  public Node getKthNode(Node head, int k) {
    Node p1 = head, p2 = head;

    for (int i = 0; i < k; i++) {
      if (p1 == null) return null;
      p1 = p1.next;
    }

    while (p1.next != null) {
      p1 = p1.next;
      p2 = p2.next;
    }

    return p2.next;
  }

}
