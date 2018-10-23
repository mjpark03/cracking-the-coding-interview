class Node {
  int value;
  Node next;
  Node(int value) { this.value = value;}
}

public class Problem0501 {

  public Node addLists(Node node1, Node node2) {
    int carry = 0;
    Node head = null, p = null;

    while (node1 != null && node2 != null) {
      int sum = node1.value + node2.value + carry;
      carry = sum / 10;
      Node newNode = new Node(sum % 10);

      if (head == null) {
        head = newNode;
        p = head;
      }

      p.next = newNode;
      p = p.next;
      node1 = node1.next;
      node2 = node2.next;
    }

    if (node1 != null) {
      while (node1 != null) {
        p.next = new Node(node1.value);
        p = p.next;
        node1 = node1.next;
      }
    }

    if (node2 != null) {
      while (node2 != null) {
        p.next = new Node(node2.value);
        p = p.next;
        node2 = node2.next;
      }
    }

    return head;
  }

}
