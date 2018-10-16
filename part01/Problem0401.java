
public class Problem0401 {

  public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    int[] counts = new int[256];

    for (char ch: s.toCharArray())
      counts[ch - 'a']++;

    boolean check = false;
    for (int count: counts) {
      if (count%2 != 0) {
        if (check)
          return false;
        else
          check = true;
      }
    }

    return true;
  }

}
