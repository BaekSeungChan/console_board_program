package KOSA240216;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student2{
    private String name;
    private String sex;

    private int score;

    public Student2(String name, String sex, int score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + score +
                '}';
    }
}


public class CollectExample {
    public static void main(String[] args) {
        List<Student2> totalList = new ArrayList<>();
        totalList.add(new Student2("홍길동", "남", 92));
        totalList.add(new Student2("김수영", "여", 87));
        totalList.add(new Student2("감자바", "남", 95));
        totalList.add(new Student2("오해영", "여", 93));

//		List<Student> mList = new ArrayList<Student>();
//		for (Student s : totalList) {
//			if (s.getSex().equals("남")) {
//				mList.add(s);
//			}
//		}

        List<Student2> mList = new ArrayList<>();
        totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .map(s -> mList.add(s))
                .forEach(s -> System.out.println(s));

        System.out.println(mList);

        //남학생만 묶어 List 생성
		/*
		List<Student> maleList = totalList.stream()
		 		.filter(s->s.getSex().equals("남"))
		 		.collect(Collectors.toList());*/

        List<Student2> maleList = totalList.stream()
                .filter(s->s.getSex().equals("남"))
                .toList();

        System.out.println(maleList);


        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        //학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                s -> s.getName(), //Student 객체에서 키가 될 부분 리턴
                                s -> s.getScore() //Student 객체에서 값이 될 부분 리턴
                        )
                );

        System.out.println(map);

        Map<String, Student2> map2 = totalList.stream()
                .collect(
                        Collectors.toMap(
                                s -> s.getName(), //Student 객체에서 키가 될 부분 리턴
                                s -> s //Student 객체에서 값이 될 부분 리턴
                        )
                );

        System.out.println(map2);

    }
}