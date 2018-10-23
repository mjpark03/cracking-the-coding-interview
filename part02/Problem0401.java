class Node {
  int value;
  Node next;
  Node(int value) { this.value = value;}
}

public class Problem0401 {
  
  public void partition(Node head, int value) {
    Node fake = new Node(0);
    fake.next = head;

    Node p1 = fake, p2 = fake;
    while (p1.next != null && p1.next.value == value)
      p1 = p1.next;

    if (p1.next.value != value)
      return;

    while (p2.next != null) {
      if (p2.next.value < value) {
        Node temp1 = p2.next;
        Node temp2 = p2.next.next;

        p2.next.next = p1.next;
        p2.next = temp2;
        p1.next = temp1;
        p1 = p1.next;
      } else {
        p2 = p2.next;
      }
    }
  }

}
