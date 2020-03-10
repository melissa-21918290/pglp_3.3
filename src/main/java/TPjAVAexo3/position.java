package TPjAVAexo3;

public class position {
	private int x;
	private int y;
	 
	

	public position (int x, int y){
		this.x=x;
		this.y=y; 
	}

	protected void deplaceX(int nbCases) {
		this.x=this.x+nbCase;
	}
	
	protected void deplaceY(int nbCases) {
		this.y=this.y+nbCase;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}

	
}