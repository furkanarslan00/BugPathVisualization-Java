
public class Simulation {

	public static void main(String[] args) {
		
		int vis = 0;
		int direct;
		
		int row = 39;
		int col= 19;
		
		int [][]board=new int[row][col];
			
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				board[i][j] = 0;
			}
		}
		
		int x = 1;
		int y =1;
		
		Position startPoint = new Position(x,y);
		
		Bug bug = new Bug(startPoint);
		
		board[x][y]++;
		vis++;
		
		while(vis<row*col) {
			direct = 1 + (int)(Math.random() * ((7) + 1));
			
			if(direct == 1) {
				if(bug.getPos().getX()-1 >=0) {
					Position cor = new Position(bug.getPos().getX()-1,bug.getPos().getY());
					bug.setPos(cor);
					if(board[cor.getX()][cor.getY()] ==0) {
						vis++;
					}
					board[cor.getX()][cor.getY()]++;
				}
			}
			else if(direct == 2) {
				if(bug.getPos().getX()-1 >=0 && bug.getPos().getY()+1 <= col-1) {
					Position cor = new Position(bug.getPos().getX()-1,bug.getPos().getY()+1);
					bug.setPos(cor);
					if(board[cor.getX()][cor.getY()] ==0) {
						vis++;
					}
					board[cor.getX()][cor.getY()]++;
				}
			}
			else if(direct == 3) {
				if(bug.getPos().getY()+1 <= col-1) {
					Position cor = new Position(bug.getPos().getX(),bug.getPos().getY()+1);
					bug.setPos(cor);
					if(board[cor.getX()][cor.getY()] ==0) {
						vis++;
					}
					board[cor.getX()][cor.getY()]++;
				}
			}
			else if(direct == 4) {
				if(bug.getPos().getX()+1 <= row-1 && bug.getPos().getY()+1 <= col-1) {
					Position cor = new Position(bug.getPos().getX()+1,bug.getPos().getY()+1);
					bug.setPos(cor);
					if(board[cor.getX()][cor.getY()] ==0) {
						vis++;
					}
					board[cor.getX()][cor.getY()]++;
				}
			}
			else if(direct == 5) {
				if(bug.getPos().getX()+1 <=row-1) {
					Position cor = new Position(bug.getPos().getX()+1,bug.getPos().getY());
					bug.setPos(cor);
					if(board[cor.getX()][cor.getY()] ==0) {
						vis++;
					}
					board[cor.getX()][cor.getY()]++;
				}
			}
			else if(direct == 6) {
				if(bug.getPos().getX()+1 <=row-1 && bug.getPos().getY()-1 >= 0) {
					Position cor = new Position(bug.getPos().getX()+1,bug.getPos().getY()-1);
					bug.setPos(cor);
					if(board[cor.getX()][cor.getY()] ==0) {
						vis++;
					}
					board[cor.getX()][cor.getY()]++;
				}
			}
			else if(direct == 7) {
				if(bug.getPos().getY()-1 >= 0) {
					Position cor = new Position(bug.getPos().getX(),bug.getPos().getY()-1);
					bug.setPos(cor);
					if(board[cor.getX()][cor.getY()] ==0) {
						vis++;
					}
					board[cor.getX()][cor.getY()]++;
				}
			}
			else if(direct == 8) {
				if(bug.getPos().getX()-1 >=0 && bug.getPos().getY()-1 >=0) {
					Position cor = new Position(bug.getPos().getX()-1,bug.getPos().getY()-1);
					bug.setPos(cor);
					if(board[cor.getX()][cor.getY()] ==0) {
						vis++;
					}
					board[cor.getX()][cor.getY()]++;
				}
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println(" ");
			
		}
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
