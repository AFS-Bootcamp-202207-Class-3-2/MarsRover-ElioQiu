package com.afs.tdd;

public class MarsRover {
    private int xIndex;
    private int yIndex;
    private String direction;



    public MarsRover(int xIndex, int yIndex, String direction) {
        this.xIndex = xIndex;
        this.yIndex = yIndex;
        this.direction = direction;
    }

    public int getxIndex() {
        return xIndex;
    }

    public int getyIndex() {
        return yIndex;
    }

    public String getDirection() {
        return direction;
    }

    public void executeCommands(String commands) {

    }
}
