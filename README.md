# Mars Rover Technical Challenge

## Problem Summary

NASA is sending a squad of robotic rovers to explore a rectangular plateau on Mars. Each rover’s movement is controlled by a sequence of instructions:

- `L` → turn left 90°
- `R` → turn right 90°
- `M` → move forward one grid space in the current direction

Each rover receives:
1. The plateau size (e.g., `5 5`)
2. An initial position and direction (e.g., `1 2 N`)
3. A movement instruction string (e.g., `LMLMLMLMM`)

## Sample Input
5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM

## Expected Output
1 3 N
5 1 E

## Technologies
- Java 21
- Maven
- JUnit 5

## How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/arinaotshamano/MarsRoverChallenge.git
   cd MarsRoverChallenge

2. Run tests with Maven:

mvn test

3. Or use IntelliJ to run MarsRoverApp.java.

## Author
Tshamano Arinao
