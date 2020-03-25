package TPjAVAexo3;


public class robot extends robotstatique {
	
	public robot(position p, direction d) {
		super(p, d);
	}

	public void tourne() {
		if(direction.equals(direction.NORD)) {
			this.direction=direction.EST;
		}
		else if(direction.equals(direction.EST)) {
			this.direction=direction.SUD;
		}
		else if(direction.equals(direction.SUD)) {
			this.direction=direction.OUEST;
		}
		else {
			this.direction=direction.NORD;
		}
	}
	
	@Override
	public void avance(){
		if(direction.equals(direction.NORD)) {
			this.position.deplaceY(1);
		}
		else if(direction.equals(direction.EST)) {
			this.position.deplaceX(1);
		}
		else if(direction.equals(direction.SUD)) {
			this.position.deplaceY(-1);
		}
		else {
			this.position.deplaceX(-1);
		}
	}
	
}


