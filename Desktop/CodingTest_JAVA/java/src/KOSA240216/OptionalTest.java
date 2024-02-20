package KOSA240216;

import java.util.HashMap;
import java.util.Map;

public class OptionalTest {
    public static void main(String[] args) {

        Map<String, String> numList = new HashMap<>();

        for(int i = 1; i < 20; i++){
            numList.put("chani " + i, "baek" + i);
        }

        System.out.println(numList.get("chani 1"));
    }
}
