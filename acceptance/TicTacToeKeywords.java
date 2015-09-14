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

	public String getMark (int row, int col) {
		if (t.getMark(row, col) == TicTacToe.mark.XMARK) {
			return "X";
		}
		else if (t.getMark(row, col) == TicTacToe.mark.OMARK) {
			return "O";
		}
		else return "";
	}

	public String getWinner () {
		if (t.checkForWin() == TicTacToe.mark.XMARK) {
			return "X";
		}
		else if (t.checkForWin() == TicTacToe.mark.OMARK) {
			return "O";
		}
		else if (t.checkForTie()) {
			return "TIE";
		}
		else return "";
	}
}
