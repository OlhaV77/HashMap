
import java.util.ArrayList;
import java.util.HashMap;



public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> abc = new HashMap<>();

        abc.put("a", 2);
        abc.put("f", 5);
        abc.put("d", 3);

        ArrayList<Integer> price = new ArrayList<>(abc.values());
        System.out.println(abc);              // name and price
        System.out.println(abc.keySet());   // name
        System.out.println(price);          // price

    }
}
