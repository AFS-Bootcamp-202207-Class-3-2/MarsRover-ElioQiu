package com.afs.tdd;

public class MoveAction extends Action{
    private final MarsRover marsRover;

    public MoveAction(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    void action() {
        if (Constant.N.equals(marsRover.getDirection())) {
            marsRover.setyIndex(marsRover.getyIndex()+1);
        } else if (Constant.W.equals(marsRover.getDirection())) {
            marsRover.setxIndex(marsRover.getxIndex()-1);
        } else if (Constant.S.equals(marsRover.getDirection())) {
            marsRover.setyIndex(marsRover.getyIndex()-1);
        } else if (Constant.E.equals(marsRover.getDirection())) {
            marsRover.setxIndex(marsRover.getxIndex()+1);
        }
    }

}
