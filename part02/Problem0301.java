
class Node {
  int value;
  Node next;
  Node(int value) { this.value = value;}
}

public class Problem0301 {

  public void deleteNode(Node node) {
    if (node.next == null)
      return;

    node.value = node.next.value;
    node.next = node.next.next;
  }

}
