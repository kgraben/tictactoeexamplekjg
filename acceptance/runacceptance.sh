#!/bin/bash
javac -cp .:/Users/kurtisgrabenmba/Documents/Programming/exampleTicTacToe/tic-tac-toe/build/classes/main TicTacToeKeywords.java
java -cp .:../Users/kurtisgrabenmba/Documents/Programming/robotframework/swinglibrary-1.9.4.jar;/Users/kurtisgrabenmba/Documents/Programming/robotframework/robotframework-2.9.jar org.robotframework.RobotFramework TicTacToeGUITests.txt
