class Game{
	
	public static void main(String args[]){

		Grid grid = new Grid();
		grid.show();
	}
}

class Grid{

	int[][] matrix = new int[4][4];

	public void show(){
		for(int row = 0; row < 4 ; row++){
			for(int col = 0; col < 4 ; col++){
				System.out.print(matrix[row][col] + "  ");
			}
			System.out.println();
		}
	}
}
