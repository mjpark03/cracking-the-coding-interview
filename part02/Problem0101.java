import java.util.*;

class Node {
  int data;
  Node next;
  Node(int data) { this.data = data;}
}

public class Problem0101 {
  
  public Node deleteDuplication(Node head) {
    Node prev = null, n = head;
    Set<Integer> set = new HashSet<>();

    while (n != null) {
      int value = n.data;
      if (set.contains(value)) {
        prev.next = n.next;
      } else {
        set.add(value);
        prev = n;
      }

      n = n.next;
    }

    return head;
  }
}
