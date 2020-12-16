package pl.pkrysztofiak.personal.headfirstdesignpatterns.strategy;

public class Duck {

    protected int velocity = 0;
    
    protected FlyBehaviour flyBehaviour;

    public void fly() {
        flyBehaviour.fly();
    }

    protected class Fly implements FlyBehaviour {

        public void fly() {
            velocity = 10;
            System.out.println("velocity=" + velocity);
        }
    }

    protected class Flightless implements FlyBehaviour {

        public void fly() {
            System.out.println("Flight");
        }
    }
}