package Set;
import java.util.*;

public class HashSetExample2 {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
//		Set<String> set = new HashSet<String>();
        Set<String> set = new HashSet<>();

        //객체 저장
        set.add("1");
        set.add("4");
        set.add("2");
        set.add("3");
        set.add("1");			//<-- 중복 객체이므로 저장하지 않음

//		set.add("Java");
//		set.add("JDBC");
//		set.add("Servlet/JSP");
//		set.add("Java");			//<-- 중복 객체이므로 저장하지 않음
//		set.add("iBATIS");
        String [] arrStr = {
                "Java"
                ,"JDBC"
                ,"Servlet/JSP"
                ,"Java"
                ,"iBATIS"
        };
        for (String value : arrStr) {
            //value변수의 값이 set에 존재하지 않을 경우만 저장 함
            if (!set.contains(value)) {
                set.add(value);
            }
        }
        //저장된 객체 수 출력
        int size = set.size();
        System.out.println("총 객체 수: " + size);

        for (String value : set) {
            System.out.println(value);
        }
        System.out.println();

        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }
        System.out.println();
    }
}