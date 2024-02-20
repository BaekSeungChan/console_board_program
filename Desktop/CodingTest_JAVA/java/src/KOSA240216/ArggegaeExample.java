package KOSA240216;

import java.util.Arrays;

public class ArggegaeExample {
    public static void main(String[] args) {
        // 정수 배열
        int[] arr = {1,2,3,4,5};

        // 카운팅
        long count = Arrays.stream(arr)
                .filter(n ->  n%2 ==0)
                .count();

//        System.out.println(count);

        // 총합
        long sum = Arrays.stream(arr)
                .filter(n ->  n%2 ==0)
                .sum();

//        System.out.println(sum);

        // 평균
        double avg = Arrays.stream(arr)
                .filter(n -> n%20==0)
                .average()
                .orElse(10);

        System.out.println(avg);



    }
}
