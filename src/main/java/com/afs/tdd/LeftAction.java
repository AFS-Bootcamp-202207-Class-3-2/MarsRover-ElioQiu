package com.afs.tdd;

public class LeftAction extends Action{
    public MarsRover marsRover;

    public LeftAction(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    void action() {
        if (Constant.N.equals(marsRover.getDirection())) {
            marsRover.setDirection(Constant.W);
        }
        if (Constant.W.equals(marsRover.getDirection())) {
            marsRover.setDirection(Constant.S);
        }
        if (Constant.S.equals(marsRover.getDirection())) {
            marsRover.setDirection(Constant.E);
        }
        if (Constant.E.equals(marsRover.getDirection())) {
            marsRover.setDirection(Constant.N);
        }
    }
}