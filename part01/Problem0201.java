
public class Problem0201 {
  
  public boolean isPermutation(String s, String t) {
    int[] characters = new int[256];

    for (char ch: s.toCharArray())
      characters[ch]++;

    for (char ch: t.toCharArray()) {
      characters[ch]--;
      if (characters[ch] < 0)
        return false;
    }

    return true;
  }

}
