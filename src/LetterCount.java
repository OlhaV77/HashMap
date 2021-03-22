import java.util.HashMap;
import java.util.Map;

public class LetterCount {
    public static void main(String[] args) {
        String[] abc = {"a", "b", "c", "d" , "a" , "d", "d"};
       letter(abc);
    }

    static Map<String, Integer> letter(String[] abc) {
        Map<String, Integer> map = new HashMap();
        for (String s : abc) {
            if(map.containsKey(s)){
                int count = map.get(s);
                map.put(s, count + 1);
            }
           else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
        return map;
    }


}


/*
    given an array of letters, return a Map<String, Integer> with a key
        for each different letter (string), with the value the number of times
        that letter appears in the array.

        letterCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
        letterCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
        letterCount(["c", "c", "c", "c"]) → {"c": 4}

 */