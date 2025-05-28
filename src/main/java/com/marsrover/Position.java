package com.marsrover;

public class Position {
    public int x, y;
    public Direction direction;

    public Position(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + direction;
    }
}
