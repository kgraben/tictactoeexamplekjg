package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {

	private TicTacToe t;
	@Test
	public void testInitialBoardIsEmpty() {
		TicTacToe t = new TicTacToe();
		boolean isEmpty = true;
		for (int row = 0; row < 3; row++){
			for (int column = 0; column < 3; column++){
				if (t.board[row][column] != TicTacToe.mark.EMPTY){
					isEmpty = false;
				}
			}
		}
		assertTrue(isEmpty);
	}

	@Test
	public void testMarkXInUpperRightCorner() {
		TicTacToe t = new TicTacToe();
		t.setMark(0, 2);
		assertEquals(TicTacToe.mark.XMARK, t.getMark(0,2));
	}

	@Test
	public void testMarkOInBottomLeftCorner() {
		TicTacToe t = new TicTacToe();
		t.setMark(1, 0);
		t.setMark(2, 0);
		assertEquals(TicTacToe.mark.OMARK, t.getMark(2, 0));
	}

	@Test
	public void testUnableToMarkOverExistingMark() {
		TicTacToe t = new TicTacToe();
		t.setMark(0,1);
		assertFalse(t.checkMark(0, 1));

	}

	@Test
	public void testGameIsNotOverAfterTheFirstMark() {
		TicTacToe t = new TicTacToe();
		boolean gameIsOver = true;
			if (!t.checkForTie() && t.checkForWin() == TicTacToe.mark.EMPTY){
				gameIsOver = false;
			}
		assertFalse(gameIsOver);
	}

	@Test
	public void testGameIsWonByXHorizontallyAcrossTopRow() {
		TicTacToe t = new TicTacToe();
		t.setMark(0,0);
		t.setMark(2,0);
		t.setMark(0,1);
		t.setMark(2,1);
		t.setMark(0,2);
		assertEquals(TicTacToe.mark.XMARK, t.checkForWin());
	}

	@Test
	public void testGameIsOverByTieIfAllLocationsAreFilled() {
		TicTacToe t = new TicTacToe();
		t.setMark(0,0);
		t.setMark(0,2);
		t.setMark(0,1);
		t.setMark(1,0);
		t.setMark(1,2);
		t.setMark(1,1);
		t.setMark(2,0);
		t.setMark(2,1);
		t.setMark(2,2);
		assertTrue(t.checkForTie());
	}
}
