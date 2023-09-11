package Interfaces;

public class Car implements Engine, Brake{
    @Override
    public void brake() {
        System.out.println(
                "Brake of a car"
        );
    }

    @Override
    public void start() {
        System.out.println(
                "start of a car"
        );
    }

    @Override
    public void stop() {
        System.out.println(
                "stop of a car"
        );
    }

    @Override
    public void accelerate() {
        System.out.println(
                "acceleration of a car"
        );
    }
}
