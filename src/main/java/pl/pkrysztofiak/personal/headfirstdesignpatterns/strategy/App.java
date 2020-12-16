package pl.pkrysztofiak.personal.headfirstdesignpatterns.strategy;

public class App {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck decoyDuck = new DecoyDuck();
        mallardDuck.fly();
        decoyDuck.fly();
    }
}