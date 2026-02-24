package com.IsaacRideal.JavaChess.model;

public class Square {
    private final int x;
    private final int y;
    private boolean occupied;
    private final String colour;

    Square(int x, int y, boolean occupied, String colour) {
        this.x=x;
        this.y=y;
        this.occupied=occupied;
        this.colour=colour;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public String getColour() {
        return colour;
    }
}
