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
        int len = commands.length();
        for (int index = 0; index < len; index++) {
            executeCommand(String.valueOf(commands.charAt(index)));
        }
    }

    private void executeCommand(String command) {
        if (Constant.M.equals(command)) {
            move();
        } else {
            turnLeft();
        }
    }

    private void turnLeft() {
        if (Constant.E.equals(direction)) {
            this.direction = Constant.N;
        }
    }

    private void move() {
        if (Constant.N.equals(direction)) {
            this.yIndex++;
        }
    }
}
