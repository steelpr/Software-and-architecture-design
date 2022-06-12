package Command;

public class Doll implements Command {
	private Board board;

	public Doll(Board board) {
		this.board = board;
	}

	@Override
	public void execute() {
		this.board.iNeedDoll();
	}
}
