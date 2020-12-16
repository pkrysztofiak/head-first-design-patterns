package pl.pkrysztofiak.personal.headfirstdesignpatterns.strategy;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehaviour = new Flightless();
    }
}