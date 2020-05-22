package model;

import processing.core.PApplet;

public abstract class Persona {

	PApplet app; 
	int estado, posx, posy, dirx, diry, r,g,b; 
	
	
	public Persona(PApplet app) {
		this.app= app; 
	}
	
	
	public abstract void pintar(); 
	
	public void mover() {
		posx+=posx*dirx; 
		posy+=posy*diry; 
		if(posx<0||posx>app.width) {
			dirx*=-1; 
		}
		if(posy<0||posy>app.height) {
			dirx*=-1; 
		}
	}
	
	
	


	//------------gets y sets
	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}


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
	
	

}
