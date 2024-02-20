package KOSA240216;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortinExample2 {
    public static void main(String[] args) {
        // List 컬렉션 생성
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 80));
        studentList.add(new Student("유관순", 90));
        studentList.add(new Student("백승찬", 82));

        // Comparable에 대한 예외처리가 나오면 구현해줘야 한다.

        // 점수를 기준으로 오름차순으로 정렬한 새 스트림
        studentList.stream()
                .sorted((s1, s2) -> s1.getScore() - s2.getScore())
                .forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));

        // 점수를 기준으로 내림차순으로 정렬한 새 스트림
        studentList.stream().sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
    }
}
