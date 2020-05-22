package model;

import processing.core.PApplet;

public class Sano extends Persona{

	public Sano(PApplet app, int posx, int posy) {
		super(app, posx, posy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		try {
			mover(); 
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void pintar() {
		app.fill(0,255,0);
		app.ellipse(posx, posy, 7, 7);
		// TODO Auto-generated method stub
		
	}



}
