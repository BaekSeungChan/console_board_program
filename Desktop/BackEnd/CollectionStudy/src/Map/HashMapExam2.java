package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// DTO -> Map으로 대신하여 구현하는 방법
public class HashMapExam2 {
    List<Map<String, String>> array = new ArrayList<>();

    public void addStudent(String id, String name, String phone){
        Map<String, String> map = new HashMap<>();

        map.put("id",id);
        map.put("name", name);
        map.put("phone", phone);

        // 배열에 map 객체를 추가한다.
        array.add(map);
    }

    public void output(){
        for (var map : array){
            System.out.println(map);
        }
    }

    public static void main(String[] args) {
        //한 사람 넣을 때
//        Map<String, String> map = new HashMap<>();
//
//        map.put("id", "1");
//        map.put("name", "홍길동");
//        map.put("phone", "010-1234-1234");

        // 한 사람의 객체를 map으로 생성하여 Lis에 추가하여 관리함

        HashMapExam2 exam = new HashMapExam2();
        exam.addStudent("1", "홍길동", "010-1111-2222");
        exam.addStudent("2", "유관순", "010-1111-3333");

        exam.output();
    }
}
