package pattern;

public class MallarDuck extends Duck{

    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void quack(){
        quackBehavior.quack();
    }

    public void display(){
        System.out.println("저는 물오리입니다.");
    }
}
