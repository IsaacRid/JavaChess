package com.IsaacRideal.JavaChess.model;

import java.util.HashMap;

public class Board {
    private int width;
    private int height;
    private HashMap<Square, Piece> board;

    Board(int width, int height) {
        this.width = width;
    }
}
