package KOSA240216;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

//        double avg = list.stream()
//                .mapToInt(Integer::intValue)
//                .average()
//                .getAsDouble();
//
//        System.out.println(avg);


        //방법 1
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        if(optional.isPresent()){
            System.out.println("방법_1 평균 : " + optional.getAsDouble());
        } else {
            System.out.println("0.0");
        }

        // 방법 2
        double avg1 = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("방법2_평균 :  " + avg1);

        // 방법 3 -> 정상적인 코드에 한해서 했을 때 한다고 생각하면 됨
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("방법3_평균_평균 : " + a));
    }
}
