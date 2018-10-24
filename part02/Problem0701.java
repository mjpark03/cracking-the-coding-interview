class Node {
  int value;
  Node next;
  Node(int value) { this.value = value;}
}

public class Problem0701 {

  public Node findIntersection(Node node1, Node node2) {
    Node head1 = node1, head2 = node2;
    int size1 = 0, size2 = 0;

    while (head1.next != null) {
      size1++;
      head1 = head1.next;
    }

    while (head2.next != null) {
      size2++;
      head2 = head2.next;
    }

    if (head1 != head2)
      return null;

    head1 = node1;
    head2 = node2;

    if (size1 - size2 > 0) {
      while (size1 != size2) {
        head1 = head1.next;
        size1--;
      }
    } else if (size1 - size2 < 0) {
      while (size2 != size1) {
        head2 = head2.next;
        size2--;
      }
    }

    while (head1 != head2) {
      head1 = head1.next;
      head2 = head2.next;
    }

    return head1;
  }

}
