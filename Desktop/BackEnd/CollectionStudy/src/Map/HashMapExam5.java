package Map;

import java.util.*;

/*
 * 배열에서 자료를 찾는 방법 (속도 차이 비교) List, List<Map>, Map
 */
public class HashMapExam5 {

    List<Map<String, String>> array = new ArrayList<Map<String,String>>();

    public void addStudent(String id, String name, String phone) {
        Map<String, String>  map = new HashMap<>();

        map.put("id", id);
        map.put("name", name);
        map.put("phone", phone);

        //배열에 map 객체를 추가한다
        array.add(map);
    }

    public void output() {
        for (var map : array) {
            System.out.println(map);
        }
    }

    //한사람의 객체를 map으로 생성하여 List에 추가하여 관리함
    public static void main(String[] args) {

        HashMapExam5 exam = new HashMapExam5();

        for (int i=0;i<10000;i++) {
            //exam.addStudent("" + i, "홍길동", "010-1234-1234");
            //exam.addStudent(String.valueOf(i), "홍길동" + i, "010-1234-1234");
            exam.addStudent(String.valueOf(i), "홍길동" + String.valueOf(i), "010-1234-1234");
        }

        //exam.output();
        //찾을 자료
        String name = "홍길동9000";//, "홍길동10";

        //이름을 이용하여 배열에서 자료를 찾는 코드
        //검색 시간을 출력할 것

        long startTime = System.nanoTime();
        for (Map<String, String> student : exam.array) {
            if (name.equals(student.get("name"))) {
                //원하는 자료 찾음
                System.out.println(student);
                break;
            }
        }
        long endTime = System.nanoTime();
        System.out.println("홍길동9000: " + (endTime - startTime) + " ns");



        String name2 = "홍길동10";
        startTime = System.nanoTime();
        for (Map<String, String> student : exam.array) {
            if (name2.equals(student.get("name"))) {
                //원하는 자료 찾음
                System.out.println(student);
                break;
            }
        }
         endTime = System.nanoTime();
        System.out.println("홍길동10: " + (endTime - startTime) + " ns");


        // List<Map> id 찾기
        String id = "9000";
        startTime = System.nanoTime();
        for (Map<String, String> student : exam.array) {
            if (id.equals(student.get("id"))) {
                //원하는 자료 찾음
                System.out.println(id);
                break;
            }
        }
        endTime = System.nanoTime();
        System.out.println("List<Map> 9000: " + (endTime - startTime) + " ns");

        // Map으로 id 찾기
        Map<String, String> studentMap = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            studentMap.put(String.valueOf(i), "Student" + i);
        }

        id = "9000";
        startTime = System.nanoTime();

        if (studentMap.containsKey(id)) {
            endTime = System.nanoTime();
//            System.out.println(id); // 9000
            System.out.println("Map 9000 :  " + (endTime - startTime) + " ns");
        }
    }
}