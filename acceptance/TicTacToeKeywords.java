import edu.jsu.mcis.*;

public class TicTacToeKeywords {
	public TicTacToe t = new TicTacToe();

	public void startNewGame () {
		t = new TicTacToe();
	}

	public void markLocation (int row, int col){
		t.setMark(row, col);
	}

	public String checkLocation (int row, int col, String marker) {
			return (t.getMark(row, col).toString());
	}

	public String returnStringMark (int row, int col) {
		return (t.getMark(row, col).toString());

	}

	public String winnerShouldBe () {
		return (t.checkForWin().toString());
	}
}
