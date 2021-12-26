package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;

	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("É necessário que haja pelo menos 1 linha e 1 coluna");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece(int row, int column) {
		if (!positionExits(row, column)) {
			throw new BoardException("Posição não existe no Board");
		}
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		if (!positionExits(position)) {
			throw new BoardException("Posição não existe no Board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiecec(position)) {
			throw new BoardException("Posição já está sendo ocupada pela posição: " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece (Position position) {
		if(!positionExits(position)) {
			throw new BoardException("Posição não existe no Board");
		}
		if(piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return aux;		
	}

	private boolean positionExits(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	public boolean positionExits(Position position) {
		return positionExits(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiecec(Position position) {
		if(!positionExits(position)) {
			throw new BoardException("Posição já está sendo ocupada pela posição: " + position);
		}
		return piece(position) != null;
	}

}
