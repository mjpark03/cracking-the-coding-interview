public class Problem0102 {

  public boolean isDuplicated(String s) {
    boolean[] characters = new boolean[256];

    if (s.length() > 256)
      return true;

    for (char ch: s.toCharArray()) {
      characters[ch] = true;

      if (characters[ch])
        return true;
    }

    return false;
  }

}
