import edu.jsu.mcis.*;

public class TicTacToeKeywords {
	public TicTacToe t = new TicTacToe(); //put name of your class here

	public void startNewGame() {
		t = new TicTacToe(); //Start game here
	}

	public void checkLocation(int row, int col, mark marker) {
		t.setMark(row, col, marker);
	}

	public String getMark(int row, int col) {
		//get your set mark thing
		if(t.getMark == TicTacToe.mark.XMARK) return "X";
		else if(t.getMark == TicTacToe.mark.OMARK) return "O";
		else return "";
	}

	public String getWinner() {
		if (t.checkForWin() == TicTacToe.mark.XMARK) return "X";
		else if (t.checkForWin() == TicTacToe.mark.OMARK) return "O";
		else if (t.checkForWin() == TicTacToe.mark.EMPTY) return "";
	}
}
