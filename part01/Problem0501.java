
public class Problem0501 {

  public boolean editOnec(String s, String t) {
    int difference = s.length() - t.length();
    if (Math.abs(difference) > 1)
      return false;

    if (difference == 0)
      return editReplace(s, t);
    else if (difference == 1)
      return editInsert(s, t);
    else
      return editInsert(t, s);
  }

  private boolean editReplace(String s, String t) {
    boolean check = false;
    int index1 = 0, index2 = 0;

    while (index1 < s.length() && index2 < t.length()) {
      if (s.charAt(index1) != t.charAt(index2)) {
        if (check)
          return false;
        else
          check = true;
      }

      index1++;
      index2++;
    }

    return true;
  }

  private boolean editInsert(String s, String t) {
    int index1 = 0, index2 = 0;

    while (index1 < s.length() && index2 < t.length()) {
      if (s.charAt(index1) != t.charAt(index2)) {
        if (index1 != index2)
          return false;
        else
          index1++;
      } else {
        index1++;
        index2++;
      }
    }

    return true;
  } 
}
