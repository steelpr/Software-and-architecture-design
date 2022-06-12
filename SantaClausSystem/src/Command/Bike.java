package Command;

public class Bike implements Command {
	private Board board;

	public Bike(Board board) {
		this.board = board;
	}

	@Override
	public void execute() {
		this.board.iNeedBike();
	}

}
