package org.example;

import com.marsrover.Direction;
import com.marsrover.Plateau;
import com.marsrover.Position;
import com.marsrover.Rover;

public class Main {
    public static void main(String[] args) {
        Plateau plateau = new Plateau(5, 5);

        Rover rover1 = new Rover(new Position(1, 2, Direction.N), plateau);
        rover1.processCommands("LMLMLMLMM");
        System.out.println(rover1.getPosition()); // Expected: 1 3 N

        Rover rover2 = new Rover(new Position(3, 3, Direction.E), plateau);
        rover2.processCommands("MMRMMRMRRM");
        System.out.println(rover2.getPosition()); // Expected: 5 1 E
    }
}