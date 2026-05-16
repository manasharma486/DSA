
public class Characterhashing {

    static int index(char c){

        return (int)c - (int)'a' ;
    }

    // the characters either be a-z or A-Z , in both of the cases the size of hash array will be 26 !!
    public static void main(String[] args) {
        String str = "manassharmaisagoodboy" ;
        
        char[] arr = new char[str.length()];
        int hashArr[] = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }

       for (char c : arr) {
            hashArr[index(c)]++; 
       }

       //fetching
       System.out.println(hashArr[index('o')]);
       
    }

}
