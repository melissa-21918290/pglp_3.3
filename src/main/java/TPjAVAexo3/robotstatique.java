package TPjAVAexo3;

public class robotstatique {
	protected position position;
	protected direction direction;
	
	public robotstatique(position p, direction d) {
		this.position=p;
		this.direction=d;
	}
	
	public direction getdirection(){
		return this.direction;
	}
	
	public position getposition() {
		return this.position;
	}
	
	public void avance() {
		
	}}