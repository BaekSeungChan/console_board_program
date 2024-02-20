package KOSA240216;

import java.util.*;

public class MatchingExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,3,2,4,3);

        boolean result = true;
        for(int v : list){
            if(v % 2 !=0){
                result = false;
                break;
            }
        }
        if(result){
            System.out.println("모든 값은 짝수 입니다.");
        } else {
            System.out.println("모든 값은 짝수가 아닙니다.");
        }


        result = list.stream().allMatch(a -> a % 2==0);
        if(result){
            System.out.println("모든 값은 짝수입니다.");
        } else {
            System.out.println("모든 값은 짝수가 아닙니다.");
        }

        result = list.stream().anyMatch(v -> v == 2);

        System.out.println("anyResult " + result);



        result = list.stream()
                .allMatch(a-> a%2==0);
        System.out.println(result);
    }
}
