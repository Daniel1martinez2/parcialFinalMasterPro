package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet{
	Controller controller; 

	public static void main(String[] args) {
	 PApplet.main("view.Main");

	}
	public void settings() {

		size(500,500); 
	}

	public void setup() {
		controller = new Controller(this); 
		controller.setupmod();

	}

	public void draw() {
		background(0); 
		controller.test1(10);

	}
	public void keyPressed() {
		
	}
	
	
	

	
	
	
}
