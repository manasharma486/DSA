import java.util.HashMap;
import java.util.Map;

public class MapHashing {
    public static void main(String[] args) {
        Map<Integer , Integer> hashMap = new HashMap<>();
        int[]arr = {12, 1,3,2,1,3} ;
        
        for (int i : arr) {
          hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }

        System.out.println(hashMap);

        Map<Character , Integer> charHashMap = new HashMap<>();
        String str = "manassharmaisagoodboy" ;

        for (int i = 0; i < str.length(); i++) {
            charHashMap.put(str.charAt(i) , charHashMap.getOrDefault(str.charAt(i), 0)+ 1) ;
        }

        System.out.println(charHashMap.get('k'));

        
    }
    

    
}
