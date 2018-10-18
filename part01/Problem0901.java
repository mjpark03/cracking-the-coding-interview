
public class Problem0901 {

  public boolean isSubstring(String s1, String s2) {
    if (s1.length() != s2.length())
      return false;

    s1 += s1;
    return s1.contains(s2);
  }

}
