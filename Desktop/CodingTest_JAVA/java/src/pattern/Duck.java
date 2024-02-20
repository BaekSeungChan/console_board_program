package pattern;

public abstract class Duck {

    QuackBehavior quackBehavior;

    FlyBehavior flyBehavior;

    public void performQuack(){
        quackBehavior.quack();
        flyBehavior.fly();
    }

}
