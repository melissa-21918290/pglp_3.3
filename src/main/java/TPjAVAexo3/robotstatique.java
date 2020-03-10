package TPjAVAexo3;

public class robotstatique {
	protected Position position;
	protected Direction direction;
	
	public rbotstatique(position p, direction d) {
		this.position=p;
		this.direction=d;
	}
	
	public direction getdirection()
		return this.direction;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	public void avance() {
		;