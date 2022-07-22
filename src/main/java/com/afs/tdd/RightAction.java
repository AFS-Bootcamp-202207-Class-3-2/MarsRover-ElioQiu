package com.afs.tdd;

public class RightAction extends Action{
    public MarsRover marsRover;

    public RightAction(MarsRover marsRover) {
        this.marsRover = marsRover;
    }
    @Override
    void action() {
        switch (marsRover.getDirection()) {
            case Constant.N:
                marsRover.setDirection(Constant.E);
                break;
            case Constant.W:
                marsRover.setDirection(Constant.N);
                break;
            case Constant.S:
                marsRover.setDirection(Constant.W);
                break;
            case Constant.E:
                marsRover.setDirection(Constant.S);
                break;
        }
    }
}
