package com.afs.tdd;

public class LeftAction extends Action{
    public MarsRover marsRover;

    public LeftAction(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    void action() {
        switch (marsRover.getDirection()) {
            case Constant.N:
                marsRover.setDirection(Constant.W);
                break;
            case Constant.W:
                marsRover.setDirection(Constant.S);
                break;
            case Constant.S:
                marsRover.setDirection(Constant.E);
                break;
            case Constant.E:
                marsRover.setDirection(Constant.N);
                break;
        }
    }
}
