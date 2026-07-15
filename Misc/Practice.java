import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {
    
  public static void main(String[] args) {
    String s = "abba";
    int length = 0;
    Map<Character, Integer> map = new HashMap<>(); 

    for (int i = 0; i < s.length(); i++) {
      Character c = s.charAt(i);

      if (map.containsKey(c)) {
        
        length = Math.max(length, (i + 1)  - (map.get(c) + 1));
        map.put(c , i);
      }
      else {
        map.put(c, i);
        length++ ;
      }

    }

    System.out.println(length);
  }
  

  
}