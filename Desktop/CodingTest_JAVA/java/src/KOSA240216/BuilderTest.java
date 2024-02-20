package KOSA240216;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class BuilderTest {
    private String name;
    private int age;
}


class Aaa{
    public static void main(String[] args) {

        var aa = BuilderTest.builder()
                .name("chan")
                .age(10)
                .build();

        System.out.println(aa);

    }
}
