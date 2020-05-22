package model;

import java.util.LinkedList;

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
					personas.add(new Sano(app)); 
					sanos ++; 
					
				}
				
			}
			if(objeto[0].equals("infectadas")) {
				for (int j = 0; j < Integer.parseInt(objeto[1]); j++) {
					personas.add(new Infectado(app)); 
					infectados++; 
				}
				
			}
			
			if(objeto[0].equals("recuperadas")) {
				for (int j = 0; j < Integer.parseInt(objeto[1]); j++) {
					personas.add(new Recuperado(app)); 
					curados ++; 
					
				}
				
			}
	
		}
		
		
		
		
		
		System.out.println(personas.size());
		//System.out.println((float)app.random(0,0xffffff));
	}
	public void test1(int cambio) {	
		
		
				
				app.fill(0,255,0);
				app.text("sanos"+ sanos, 400, cambio*20+100);
			

						
				app.fill(255,0,0);
				app.text("infectados"+infectados, 400, cambio*20+150);
					
		
				
				app.fill(0,0,255);
				app.text("recuperados"+curados , 400, cambio*20+200);
			
			
		
		
		
		
	
		for (Persona f : personas) {
			f.pintar();
			
		
		
			//f.mover();
			new Thread(f).start();
			
			
			
		}
		
	
	
	}

}
