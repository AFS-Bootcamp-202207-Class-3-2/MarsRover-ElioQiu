package com.afs.tdd;

public class MoveAction extends Action{
    private final MarsRover marsRover;

    public MoveAction(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    void action() {
        switch (marsRover.getDirection()) {
            case Constant.N:
                marsRover.setyIndex(marsRover.getyIndex()+1);
                break;
            case Constant.W:
                marsRover.setxIndex(marsRover.getxIndex()-1);
                break;
            case Constant.S:
                marsRover.setyIndex(marsRover.getyIndex()-1);
                break;
            case Constant.E:
                marsRover.setxIndex(marsRover.getxIndex()+1);
                break;
        }
    }

}
