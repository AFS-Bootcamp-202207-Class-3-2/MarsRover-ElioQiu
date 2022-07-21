package com.afs.tdd;

public class RightAction extends Action{
    public MarsRover marsRover;

    public RightAction(MarsRover marsRover) {
        this.marsRover = marsRover;
    }
    @Override
    void action() {
        if (Constant.N.equals(marsRover.getDirection())) {
            marsRover.setDirection(Constant.E);
        }else if (Constant.W.equals(marsRover.getDirection())) {
            marsRover.setDirection(Constant.N);
        }else if (Constant.S.equals(marsRover.getDirection())) {
            marsRover.setDirection(Constant.W);
        }else if (Constant.E.equals(marsRover.getDirection())) {
            marsRover.setDirection(Constant.S);
        }
    }
}
