import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayMap {


    public static void main(String[] args) {
        Map<String, Integer> name = new HashMap<>();
        String[] names = {"a", "b", "c", "d"};
        Integer[] price = {1, 2, 3, 4};

        for (String s : names) {
            for(Integer i : price){
            if (name.containsKey(s)) {
                i = name.get(s);

                name.put(s, i );

            } else {
                name.put(s, i);
                System.out.println(name);
            }
            }
        }


    }


}

