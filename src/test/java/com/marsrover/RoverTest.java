package com.marsrover;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoverTest {

    @Test
    public void testRover1FinalPosition() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(new Position(1, 2, Direction.N), plateau);
        rover.processCommands("LMLMLMLMM");
        assertEquals("1 3 N", rover.getPosition().toString());
    }

    @Test
    public void testRover2FinalPosition() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(new Position(3, 3, Direction.E), plateau);
        rover.processCommands("MMRMMRMRRM");
        assertEquals("5 1 E", rover.getPosition().toString());
    }

    @Test
    public void testOutOfBoundsThrowsException() {
        Plateau plateau = new Plateau(5, 5);
        Rover rover = new Rover(new Position(5, 5, Direction.N), plateau);
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            rover.processCommands("M");
        });
        assertTrue(exception.getMessage().contains("Rover tried to move out of bounds"));
    }
}
