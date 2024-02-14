package List;

import java.util.ArrayList;
import java.util.List;

public class ListJava {
    public static void main(String[] args) {
        // List 생성
        List<String> list = new ArrayList<>();

        // add 메서드로 요소 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // void add(index, element) 메서드로 특정 인덱스에 요소 추가
        list.add(1, "Orange");

        // set 메서드로 특정 인덱스의 요소를 변경
        list.set(2, "Grape");

        // contains 메서드로 요소의 존재 여부 확인
        boolean containsBanana = list.contains("Banana");
        System.out.println("Contains Banana? " + containsBanana);

        // get 메서드로 특정 인덱스의 요소 가져오기
        String item = list.get(0);
        System.out.println("First item: " + item);

        // isEmpty 메서드로 리스트가 비어있는지 확인
        boolean isEmpty = list.isEmpty();
        System.out.println("Is list empty? " + isEmpty);

        // size 메서드로 리스트의 크기(요소의 수) 확인
        int size = list.size();
        System.out.println("List size: " + size);

        // remove(object) 메서드로 특정 요소 삭제 (성공 시 true 반환)
        boolean isRemoved = list.remove("Cherry");
        System.out.println("Is Cherry removed? " + isRemoved);

        // remove(index) 메서드로 특정 인덱스의 요소 삭제
        String removedItem = list.remove(2);
        System.out.println("Removed item: " + removedItem);

        // clear 메서드로 리스트의 모든 요소 삭제
        list.clear();
        System.out.println("List cleared.");
        System.out.println("List size after clear: " + list.size());
    }

//    add(E e): 리스트의 끝에 요소를 추가합니다.
//    add(int index, E element): 리스트의 특정 인덱스에 요소를 추가합니다.
//    set(int index, E element): 리스트의 특정 인덱스에 있는 요소를 지정된 요소로 변경합니다.
//    contains(Object o): 리스트가 특정 요소를 포함하고 있는지 여부를 반환합니다.
//    get(int index): 리스트의 특정 인덱스에 있는 요소를 반환합니다.
//    isEmpty(): 리스트가 비어있는지 여부를 반환합니다.
//    size(): 리스트에 있는 요소의 수를 반환합니다.
//    remove(Object o): 리스트에서 첫 번째로 나타나는 특정 요소를 삭제합니다.
//    remove(int index): 리스트의 특정 인덱스에 있는 요소를 삭제합니다.
//    clear(): 리스트의 모든 요소를 삭제합니다.

}
