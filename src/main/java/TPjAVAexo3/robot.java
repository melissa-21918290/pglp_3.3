package TPjAVAexo3;

import java.util.ArrayList;

public class robot {
	private position position;
	private direction direction;
	
	
public robot(position position, direction direction){
this.position=position;
this.direction=direction;
}

/* **************** */ 

public void tourne(){ /*tourne 1/4 de* tour*/}
public void avance(){/*avance d'une case*/}

private ArrayList<robot> robots=new ArrayList<robot>();
public void avancer_tous(){
	for (robot rob : robots){
		rob.avance();
	}
}

}
