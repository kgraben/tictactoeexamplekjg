#!/bin/bash
javac -cp .:/Users/kurtisgrabenmba/Documents/Programming/exampleTicTacToe/tic-tac-toe/src/main/java/edu/jsu/mcis
java -cp .:../build/classes/main:/Users/kurtisgrabenmba/Documents/Programming/RobotFramework/robotframework-2.9.jar org.robotframework.RobotFramework TicTacToeTests.txt
