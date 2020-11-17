package com.rockets.persitence;

import java.util.ArrayList;
import java.util.List;

import com.rockets.project.Rocket;

public class RocketsRepository {

	private static List<Rocket> rockets = new ArrayList<Rocket>();
	
	//Constructor
	
	public RocketsRepository(){
		
	}
	
	//Retorno de lo todos los cochetes que tenemos almacenados
	public List<Rocket> GetAllRockets (){
		return new ArrayList<>(rockets);
		

	}
	
	//Método para añaidr cohetes
	public void addRocket(Rocket rocket) throws Exception{
		if(rocket==null) throw new Exception();
		rockets.add(rocket);		
	
	}
}
