class Node {
  int value;
  Node next;
  Node(int value) { this.value = value;}
}

public class Problem0502 {

  public Node addLists(Node node1, Node node2, int carry) {
    if (node1 == null && node2 == null && carry == 0)
      return null;

    int sum = 0;
    if (node1 != null) sum += node1.value;
    if (node2 != null) sum += node2.value;
    sum += carry;

    Node newNode = new Node(sum);
    if (node1 != null || node2 != null) {
      Node next = addLists(node1 != null ? node1.next : null,
                           node2 != null ? node2.next : null, sum / 10);
      newNode.next = next;
    }

    return newNode;
  }

}
