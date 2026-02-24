package com.IsaacRideal.JavaChess.model;

public class Square {
    private boolean occupied;
    private final String colour;

    Square(boolean occupied, String colour) {
        this.occupied=occupied;
        this.colour=colour;
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
