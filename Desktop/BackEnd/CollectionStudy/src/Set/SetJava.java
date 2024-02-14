package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetJava {
    public static void main(String[] args) {
        // Set 생성
        Set<String> set = new HashSet<>();

        // add 메서드로 요소 추가 (추가된 요소가 Set에 없었으면 true 반환)
        boolean isAdded = set.add("Apple");
        System.out.println("Apple added: " + isAdded);
        set.add("Banana");
        set.add("Cherry");

        // 동일한 요소 추가 시도 (이미 존재하기 때문에 false 반환)
        isAdded = set.add("Apple");
        System.out.println("Apple added again: " + isAdded);

        // contains 메서드로 요소의 존재 여부 확인
        boolean containsBanana = set.contains("Banana");
        System.out.println("Contains Banana? " + containsBanana);

        // isEmpty 메서드로 Set이 비어있는지 확인
        boolean isEmpty = set.isEmpty();
        System.out.println("Is set empty? " + isEmpty);

        // iterator 메서드로 Set의 요소를 순회
        System.out.println("Iterating over set:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // size 메서드로 Set의 크기(요소의 수) 확인
        int size = set.size();
        System.out.println("Set size: " + size);

        // remove 메서드로 특정 요소 삭제 (성공 시 true 반환)
        boolean isRemoved = set.remove("Cherry");
        System.out.println("Cherry removed: " + isRemoved);

        // clear 메서드로 Set의 모든 요소 삭제
        set.clear();
        System.out.println("Set cleared.");
        System.out.println("Set size after clear: " + set.size());
    }
}


/*
이 코드는 Set 인터페이스의 다음 메서드들을 사용합니다:
add(E e): Set에 요소를 추가합니다. 요소가 이미 존재하지 않으면 true를 반환합니다.
contains(Object o): Set가 특정 요소를 포함하고 있는지 여부를 반환합니다.
isEmpty(): Set이 비어있는지 여부를 반환합니다.
iterator(): Set의 요소를 순회하기 위한 Iterator를 반환합니다.
size(): Set에 있는 요소의 수를 반환합니다.
remove(Object o): Set에서 특정 요소를 삭제합니다. 요소가 존재하여 성공적으로 삭제되면 true를 반환합니다.
clear(): Set의 모든 요소를 삭제합니다.
Set 컬렉션은 주로 중복 없는 요소를 관리할 때 사용되며, 각 요소의 고유성을 보장합니다. HashSet 외에도 TreeSet, LinkedHashSet 등 다양한 Set 구현체가 있으며, 각각의 특성에 따라 적합한 경우에 사용할 수 있습니다.
* */