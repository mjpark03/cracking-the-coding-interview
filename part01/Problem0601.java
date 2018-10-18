
public class Problem0601 {

  public String compress(String s) {
    int count = 1;
    int index = 1;
    char prev = s.charAt(0);
    StringBuilder result = new StringBuilder();
    result.append(prev);

    while (index < s.length()) {
      char curr = s.charAt(index);
      if (curr == prev) {
        count++;
      } else {
        result.append(count);
        result.append(curr);
        prev = curr;
        count = 1;

        if (result.length() > s.length())
          return s;
      }
    }

    return result.toString();
  }

}
