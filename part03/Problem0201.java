import java.util.*;

public class Problem0201 extends Stack {
  Stack minStack;
  
  public Problem0201() {
    minStack = new Stack();
  }

  public void push(int value) {
    if (value < min())
      minStack.push(value);

    super.push(value);
  }

  public Integer pop() {
    int value = (int)super.pop();

    if (value == min())
      minStack.pop();
    return value;
  }

  public Integer min() {
    if (minStack.isEmpty())
      return Integer.MAX_VALUE;
    else
      return (int)minStack.peek();
  }

}
