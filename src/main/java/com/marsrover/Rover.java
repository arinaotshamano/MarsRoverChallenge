package com.marsrover;

public class Rover {
    private Position position;
    private final Plateau plateau;

    public Rover(Position position, Plateau plateau) {
        this.position = position;
        this.plateau = plateau;
    }

    public void processCommands(String commands) {
        for (char command : commands.toCharArray()) {
            switch (command) {
                case 'L' -> position.direction = position.direction.turnLeft();
                case 'R' -> position.direction = position.direction.turnRight();
                case 'M' -> move();
            }
        }
    }

    private void move() {
        int newX = position.x;
        int newY = position.y;
        switch (position.direction) {
            case N -> newY++;
            case S -> newY--;
            case E -> newX++;
            case W -> newX--;
        }

        if (plateau.isWithinBounds(newX, newY)) {
            position.x = newX;
            position.y = newY;
        } else {
            throw new IllegalStateException("Rover tried to move out of bounds!");
        }
    }

    public Position getPosition() {
        return position;
    }
}
