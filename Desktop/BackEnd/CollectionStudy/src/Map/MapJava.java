package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class MapJava {
    public static void main(String[] args) {
        // Map 생성
        Map<String, Integer> map = new HashMap<>();

        // put 메서드로 요소 추가
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // containsKey 메서드로 키의 존재 여부 확인
        boolean hasApple = map.containsKey("Apple");
        System.out.println("Contains key 'Apple'? " + hasApple);

        // containsValue 메서드로 값의 존재 여부 확인
        boolean hasValue20 = map.containsValue(20);
        System.out.println("Contains value 20? " + hasValue20);

        // entrySet 메서드와 향상된 for문으로 모든 요소 순회
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // var 키워드와 향상된 for문을 사용한 순회
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // get 메서드로 특정 키에 대한 값을 가져오기
        Integer value = map.get("Banana");
        System.out.println("Value of 'Banana': " + value);

        // isEmpty 메서드로 Map이 비어있는지 확인
        boolean isEmpty = map.isEmpty();
        System.out.println("Is map empty? " + isEmpty);

        // size 메서드로 Map의 크기(요소의 수) 확인
        int size = map.size();
        System.out.println("Map size: " + size);

        // values 메서드로 모든 값의 Collection 가져오기
        Collection<Integer> values = map.values();
        System.out.println("Map values: " + values);

        // remove 메서드로 특정 키의 요소 삭제
        Integer removedValue = map.remove("Cherry");
        System.out.println("Removed 'Cherry': " + removedValue);

        // clear 메서드로 Map의 모든 요소 삭제
        map.clear();
        System.out.println("Map cleared.");
        System.out.println("Map size after clear: " + map.size());
    }
}

/*
이 코드는 Map 인터페이스의 다음 메서드들을 사용합니다:

put(K key, V value): Map에 키와 값의 쌍을 추가합니다.
containsKey(Object key): Map에 특정 키가 존재하는지 확인합니다.
containsValue(Object value): Map에 특정 값이 존재하는지 확인합니다.
entrySet(): Map의 모든 키-값 쌍을 Set 형태로 반환합니다.
get(Object key): Map에서 특정 키에 대한 값을 반환합니다.
isEmpty(): Map이 비어있는지 확인합니다.
size(): Map에 저장된 키-값 쌍의 수를 반환합니다.
values(): Map에 저장된 모든 값의 Collection을 반환합니다.
remove(Object key): Map에서 특정 키와 그에 대응하는 값을 삭제합니다.
clear(): Map의 모든 키-값 쌍을 삭제합니다.
var 키워드를 사용한 순회는 Java 10 이상에서 지원되며, 변수 타입을 명시적으로 선언하지 않고 컴파일러가 타입을 추론하게 합니다. 이는 코드를 더 간결하게 만들어 줍니다.
* */