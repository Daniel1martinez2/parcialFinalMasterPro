package controller;

import model.Logic;
import processing.core.PApplet;

public class Controller {
	
	Logic logic; 
	PApplet app; 

	public Controller(PApplet app) {
		this.app= app; 
		logic = new Logic(app); 
		// TODO Auto-generated constructor stub
	}
	
	public void setupmod() {
		logic.setupmod();
		
	}
	
	public void test1(int c) {
		logic.test1(c);
	}
	
	

}
