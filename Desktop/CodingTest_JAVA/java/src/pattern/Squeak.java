package pattern;

public class Squeak implements QuackBehavior{

    @Override
    public void quack(){
        System.out.println("삑삑 고무 오리");
    }
}
