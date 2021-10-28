package boardgame;

public class Position {
	
	private int row;
	private int colum;

	public Position(int row, int colum) {
		this.row = row;
		this.colum = colum;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColum() {
		return colum;
	}

	public void setColum(int colum) {
		this.colum = colum;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(row);
		builder.append(", ");
		builder.append(colum);
		return builder.toString();
	}

}
