import java.util.*;

class Node {
  int value;
  Node next;
  Node(int value) { this.value = value;}
}

public class Problem0602 {

  public boolean isPalindrome(Node head) {
    Node fast = head, slow = head;
    Stack<Node> stack = new Stack<>();

    while (fast != null && fast.next != null) {
      stack.push(slow);
      slow = slow.next;
      fast = fast.next.next;
    }

    if (fast != null)
      slow = slow.next;

    while (slow != null) {
      Node node = stack.pop();
      if (node.value != slow.value)
        return false;

      slow = slow.next;
    }

    return true;
  }

}
