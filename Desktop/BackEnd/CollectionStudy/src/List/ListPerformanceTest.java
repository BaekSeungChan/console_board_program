package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceTest {
    public static void main(String[] args) {
        final int N = 100000; // 작업 수

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // ArrayList 삽입 시간 측정
        long startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            arrayList.add(0, i); // 매번 0번 인덱스에 삽입
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList insertion time: " + (endTime - startTime) + " ns");

        // LinkedList 삽입 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            linkedList.add(0, i); // 매번 0번 인덱스에 삽입
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList insertion time: " + (endTime - startTime) + " ns");

        // ArrayList 삭제 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            arrayList.remove(0); // 매번 0번 인덱스에서 삭제
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList deletion time: " + (endTime - startTime) + " ns");

        // LinkedList 삭제 시간 측정
        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            linkedList.remove(0); // 매번 0번 인덱스에서 삭제
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList deletion time: " + (endTime - startTime) + " ns");
    }
}
