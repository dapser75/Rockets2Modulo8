package com.rockets.project;

public class Booster {
	private int power;

	//M�todo de creaci�n
	public Booster(int power) {
		this.power=power;
	}
	
	//Metodo por default ******************** BORRAR *********************
	public Booster() {
		power=0;
	}

	
	
	
	//****************************    METODOS GETTTERS    *************************
	public int getPower() {
		return power;
	}

	
}
