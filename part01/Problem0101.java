
public class Problem0101 {

  public boolean isDuplicated(String s) {
    int[] characters = new int[256];

    for (char ch: s.toCharArray()) {
      characters[ch]++;
  
      if (characters[ch] > 1)
        return true;
    }

    return false;
  }

}
