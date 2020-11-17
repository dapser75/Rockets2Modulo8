package com.rockets.view;

import java.awt.List;

import com.rockets.application.RocketsApplication;


public class Main {


	private static RocketsApplication controller=new  RocketsApplication();
	
	public static void main(String[] args) throws Exception {
		int[] listpowerboosters1= {10,30,80};
		controller.CreateRockets("32WWESSDS",3,listpowerboosters1);
		int[] listpowerboosters2= {30,40,50,50,30,10};
		controller.CreateRockets("LDSFJA32",6,listpowerboosters2);
		controller.ViewRockets();
	}


}
