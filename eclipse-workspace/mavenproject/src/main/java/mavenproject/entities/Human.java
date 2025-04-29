package mavenproject.entities;

//import mavenproject.entities.Mammals;
import mavenproject.entities.organs.HumanEye;

public class Human extends Mammals {
	public HumanEye leftEye, rightEye;
	public Human() {
		leftEye = new HumanEye();
		rightEye = new HumanEye();
	}
	
}
