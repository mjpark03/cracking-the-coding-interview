
public class Problem0301 {
  
  public String url(String s) {
    int prevSize = s.length();
    int spaceCount = 0;

    for (char ch: s.toCharArray()) {
      if (ch == ' ')
        spaceCount++;
    }

    int afterSize = prevSize + spaceCount * 2;
    char[] urlCharacters = new char[afterSize];

    for (int i = prevSize-1; i >= 0; i--) {
      if (s.charAt(i) == ' ') {
        urlCharacters[afterSize] = '0';
        urlCharacters[afterSize -1] = '2';
        urlCharacters[afterSize -2] = '%';
        afterSize -= 3;
      } else {
        urlCharacters[afterSize--] = s.charAt(i);
      }
    }

    return new String(urlCharacters);
  }

}
