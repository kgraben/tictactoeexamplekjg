package edu.jsu.mcis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameBoard extends JFrame {
  private JButton[][] button = new JButton[3][3];

  TicTacToe tttBoard = new TicTacToe();

  public GameBoard() {
    setupBoard();
  }

  public static void main(String[] args) {
    GameBoard gameBoard = new GameBoard();
  }

  private void setupBoard() {
    JFrame mainBoard = new JFrame("Tic-Tac-Toe");
    mainBoard.setSize(300,300);
    mainBoard.setLayout(new GridLayout(3, 3));
    mainBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    int place = 1;
    for (int row = 0; row < 3; row++) {
      for (int column = 0; column < 3; column++) {
        button[row][column] = new JButton("");
        button[row][column].setName(Integer.toString(place));
        button[row][column].addActionListener(new ButtonListener(row, column));
        button[row][column].setFont(new Font("", Font.PLAIN, 72));
        button[row][column].setBorderPainted(false);
        mainBoard.add(button[row][column]);
        place+= 1;
      }
    }
    mainBoard.setVisible(true);
  }

  private class ButtonListener implements ActionListener {
    private int row;
    private int col;

    public ButtonListener(int r, int c) {
      row = r;
      col = c;
    }

    public void actionPerformed(ActionEvent e) {
      buttonPress(row, col);
    }
  }

  public void buttonPress (int row, int col){
    tttBoard.setMark(row, col);
      if (tttBoard.getMark(row, col) == TicTacToe.mark.XMARK){
        button[row][col].setLabel("X");
      }
      else if (tttBoard.getMark(row, col) == TicTacToe.mark.OMARK){
        button[row][col].setLabel("O");
      }
    if (tttBoard.checkForWin() == TicTacToe.mark.XMARK){
        ActionListener taskPerformer = new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "X is the winner!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
          }
        };
    }
    else if (tttBoard.checkForWin() == TicTacToe.mark.OMARK){
        ActionListener taskPerformer = new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "O is the winner!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
          }
        };
    }
    if (tttBoard.checkForTie()) {
        ActionListener taskPerformer = new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Nobody wins! You're equally good.", "Game Over", JOptionPane.INFORMATION_MESSAGE);
          }
        };
    }
  }
}
