package model;

import processing.core.PApplet;

public abstract class Persona implements Runnable , Comparable<Persona> {

	protected PApplet app; 
	protected int posx, posy, r, g, b, estado, dirx, diry; 
	public Persona(PApplet app) {

		this.app= app; 
		posx = (int)app.random(100,450); 
		posy = (int)app.random(100,450); ; 
		dirx = 1; 
		diry= 1; 
		
	}
	public abstract void pintar(); 
	
	public void mover() {
		posx += 1*dirx; 
		posy+= 1*diry;
		
		
		if(posx<0 ||posx>app.width) {
			dirx*=-1; 
		}
		if(posy<0 ||posy>app.width) {
			diry*=-1; 
		}
	}
	//gets y sets---------
	
	
	
	
	
	public int getPosx() {
		return posx;
	}
	public void setPosx(int posx) {
		this.posx = posx;
	}
	public int getPosy() {
		return posy;
	}
	public void setPosy(int posy) {
		this.posy = posy;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getDirx() {
		return dirx;
	}
	public void setDirx(int dirx) {
		this.dirx = dirx;
	}
	public int getDiry() {
		return diry;
	}
	public void setDiry(int diry) {
		this.diry = diry;
	}
	
	
	
	

	
	
	

}
