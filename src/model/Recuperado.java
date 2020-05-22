package model;

import processing.core.PApplet;

public class Recuperado extends Persona{

	public Recuperado(PApplet app, int pos, int posy) {
		super(app, posy, posy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		try {
			Thread.sleep(14000);
			mover(); 
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void pintar() {
		app.fill(0,0,255);
		app.ellipse(posx, posy, 7, 7);
		// TODO Auto-generated method stub
		
	}

}
