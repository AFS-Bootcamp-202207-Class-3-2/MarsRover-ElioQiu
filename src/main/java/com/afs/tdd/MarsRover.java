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

    public void executeCommands(String commands) {
        int len = commands.length();
        for (int index = 0; index < len; index++) {
            executeCommand(String.valueOf(commands.charAt(index)));
        }
    }

    private void executeCommand(String command) {
        if (Constant.M.equals(command)) {
            new MoveAction(this).action();
        } else if (Constant.L.equals(command)) {
            new LeftAction(this).action();
        } else if (Constant.R.equals(command)) {
            new RightAction(this).action();
        }
    }

    public void setxIndex(int xIndex) {
        this.xIndex = xIndex;
    }

    public void setyIndex(int yIndex) {
        this.yIndex = yIndex;
    }

    public void setDirection(String direction) {
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
}
