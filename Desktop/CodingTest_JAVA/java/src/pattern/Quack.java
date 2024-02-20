package pattern;

public class Quack implements QuackBehavior{

    @Override
    public void quack(){
        System.out.println("진짜 오리 꽥꽥");
    }
}
