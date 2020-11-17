package com.rockets.project;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
	private String rocketid;
	private int boosternumber;
	private List<Booster> boostersinrocket=new ArrayList<Booster>();	
	
	//M�todo de contrucci�n
	public Rocket (String rocketid, int boostersnumber) throws Exception {
		this.rocketid=rocketid;
		this.boosternumber=boostersnumber;
	}
	
	//Chequeamos que se puedan montar propulsores
	public void AddBoosters(List<Booster> boosterlist) throws Exception{
		if(boosternumber == boosterlist.size()) { //Chequeamos que no superemeros el numero m�ximo de cohetes a a�adir
			for (int i=0;i<boosterlist.size();i++) {
				boostersinrocket.add(boosterlist.get(i));
			}
		}
		else {
			System.out.println("\nESTE COHETE TIENE QUE MONTAR "+ boosternumber + "PROPULSORES Y QUIERES MONTAR"+ boosterlist.size() );
		}
		
	}

	
	
	
	//*******************************    METEODOS GETTERS     *******************************//
	public String getRocketid() {
		return rocketid;
	}

	
	//M�todo para retornar los propulsores y sus potencias
	public String getAllBoosters(){
		String allboosters="";
		for (int i = 0 ; i < boostersinrocket.size();i++) {
			allboosters +=("\n\t Propulsor: " + i + ". Potencia: " + boostersinrocket.get(i).getPower() +".");
		}
		return allboosters;
	}
	
	public int getBoosterNumber() {
		return boosternumber;
	}

	
	
	
	
}
