package KOSA240216;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};

        // 스트림은 최종 처리가 없으므로 동작하지 않음
        // 잘못 작성한 경우
        Arrays.stream(intArr)
                .filter(a -> a%2 ==0)
                .peek(n -> System.out.println(n)); // 이거는 동작하지 않는다. peek 가 최종이 아니기 때문이다.

        System.out.println("STEP1");

        // 중간 처리 메소드 peek()을 이용해서 반복 처리
        int total = Arrays.stream(intArr)
                .filter(a ->  a%2 ==0)
                .peek(s -> System.out.println(s)) // 디버깅 , 동작함 (안에 뭐가 있는지 확인)
                .sum(); // 최종 처리

        System.out.println("STEP2");


        // 최종 처리
        Arrays.stream(intArr)
                .filter(a -> a%2==0)
                .forEach(System.out::println);

    }
}
