package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	//Estamos fazendo aqui uma sobreposi��o do proprio metodo Piece contudo retornando
	//Ao inv�s da linha e coluna do board, pegando a linha e coluna da posi��o
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
}
