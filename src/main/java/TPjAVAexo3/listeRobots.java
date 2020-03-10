package TPjAVAexo3;


import java.util.ArrayList;

public class listeRobots {
	private ArrayList<robotstatique> listeRobots;
	
	public  listeRobots() {
		listeRobots = new ArrayList<robotstatique>();
	}
	
	public void addRobot(robotstatique R) {
		this.listeRobots.add(R);
	}
	
	public void avancerTous()  {
		if(!listeRobots.isEmpty()) {
			for(robotstatique R: listeRobots) {
				R.avance();
			}
		}
	}
}