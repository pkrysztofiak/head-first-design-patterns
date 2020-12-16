package pl.pkrysztofiak.personal.headfirstdesignpatterns.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new Fly();
    }
}