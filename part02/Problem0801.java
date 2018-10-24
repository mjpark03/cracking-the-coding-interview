import java.util.*;

class Node {
  int value;
  Node next;
  Node(int value) { this.value = value;}
}

public class Problem0801 {

  public Node findLoopStart(Node head) {
    Set<Node> set = new HashSet<>();

    while (!set.contains(head)) {
      set.add(head);
      head = head.next;
    }

    return head;
  }
}
