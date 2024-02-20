package KOSA240216;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 80),
                new Student("유관순", 90),
                new Student("백승찬", 82)
        );

        // 방법 1
        int sum = studentList.stream()
                .mapToInt(Student::getScore)
                .sum();

        System.out.println(sum);

        // 방법 2
        int sum2 = studentList.stream()
                .mapToInt(Student::getScore)
                .reduce(0, (a, b) -> a +b);

        System.out.println(sum2);


        Integer[] arr = {100,30,40,50};
        int sumResult = 0; // 초기식
        for(int v : arr){
            sumResult += v;
        }

        // reduce는 쓰기 많이 어렵기떄문에 덜 쓰는 편이다ㅏ.
        int aaa = Arrays.stream(arr)
                        .reduce(20, (a, b) -> a +b);

        int bbb = Arrays.stream(arr)
                        .mapToInt(Integer::intValue)
                        .sum();


        System.out.println("aaa = " + aaa);
                
                

        System.out.println("sumResult = " + sumResult);


    }
}
