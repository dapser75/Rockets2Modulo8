package com.rockets.application;

import java.util.ArrayList;
import java.util.List;

import com.rockets.persitence.RocketsRepository;
import com.rockets.project.Booster;
import com.rockets.project.Rocket;

public class RocketsApplication {
	
	private RocketsRepository repository = new RocketsRepository();
	
	public void CreateRockets(String rocketid, int boosternumber, int[] listpowerboosters) throws Exception {
		try {
			Rocket rocket= new Rocket(rocketid,boosternumber);
			rocket.AddBoosters(CreateBooster(boosternumber,listpowerboosters));//añadimos 
			repository.addRocket(rocket);
		}
		catch (Exception e){
			System.out.println("\nERROR: No se ha podido añadir el cohete.tipos de error" + e);
			
		}
	}
	
	//Metodo para añadir los cohetes
	public List<Booster> CreateBooster(int boosternumber,int[] listpowerboosters){
		List<Booster> boostersinrocket = new ArrayList<Booster>();
		for(int i=0; i <boosternumber;i++) {
			boostersinrocket.add(new Booster(listpowerboosters[i]));
		}
		return boostersinrocket;
	}

	public void ViewRockets() {
		List<Rocket> rockets = repository.GetAllRockets();
		System.out.println("Estos son los cohetes que tenemos alamcenados:");
		for (Rocket rocket : rockets) {
			System.out.println("- Nombre COHETE: "+rocket.getRocketid()+ ". Numero de propulsores:" + rocket.getBoosterNumber());
			System.out.println(rocket.getAllBoosters());
		}
	}

}
