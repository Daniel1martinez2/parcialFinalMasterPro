package model;

import java.util.LinkedList;

import myExceptions.Exception1;
import processing.core.PApplet;

public class Logic {
	
	private PApplet app; 
	Persona a1; 
	String [] text1; 
	LinkedList<Persona> personas = new LinkedList<Persona>(); 
	Colorcompare compaColor; 
	int infectados, sanos, curados; 
	

	public Logic(PApplet app) {
		this.app= app; 
		
		compaColor = new Colorcompare(); 
		infectados = 0; 
		sanos = 0; 
		curados = 0; 
	}
	
	
public void setupmod() {
	
		
		
		String parto []; 
		 parto= app.loadStrings("../parcialFinalMasterPro/lib/textone.txt"); 
		 
		for (int i = 0; i < parto.length; i++) {
			String [] objeto = parto[i].split(":"); 
			System.out.println(objeto[0]+" "+objeto[1] );
			
			if(objeto[0].equals("sanas")) {
				for (int j = 0; j < Integer.parseInt(objeto[1]); j++) {
					personas.add(new Sano(app,(int)app.random(100,450),(int)app.random(100,450))); 
					sanos ++; 
					
				}
			}
			if(objeto[0].equals("infectadas")) {
				for (int j = 0; j < Integer.parseInt(objeto[1]); j++) {
					personas.add(new Infectado(app,(int)app.random(100,450),(int)app.random(100,450))); 
					infectados++; 
				}
			}
			if(objeto[0].equals("recuperadas")) {
				for (int j = 0; j < Integer.parseInt(objeto[1]); j++) {
					personas.add(new Recuperado(app,(int)app.random(100,450),(int)app.random(100,450))); 
					curados ++; 
				}
			}
		}
		System.out.println(personas.get(6)	);
		//System.out.println((float)app.random(0,0xffffff));
	}
	public void test1(int cambio) {	
				app.fill(0,255,0);
				
				app.text("sanos"+sanos + personas.size(), 400, cambio*20+100);
				app.fill(255,0,0);
				app.text("infectados"+infectados, 400, cambio*20+150);
				app.fill(0,0,255);
				app.text("recuperados"+curados , 400, cambio*20+200);
		for (Persona f : personas) {
			f.pintar();
			//f.mover();
			new Thread(f).start();
		}
		
		for (int i = 0; i < personas.size(); i++) {      
			for (int j = 0; j < personas.size(); j++) {
				
				if(personas.get(i) instanceof Infectado && personas.get(j) instanceof Sano
						) {
					
					contagio(personas.get(i), personas.get(j));
					
					
				}
			}
		}
	}
	
	
	public void contagio(Persona persona, Persona persona2) {
		if(infectados >30) {
		}
		if(PApplet.dist(persona.posx, persona.posy, persona2.posx, persona2.posy)<=30) {
			app.fill(255); 
			app.stroke(255);
			app.line(persona.posx, persona.posy, persona2.posx, persona2.posy);
			//personas.add(new Infectado(app,persona2.posx, persona2.posy ));
		     infectados++; 
		}
		
	}

}
