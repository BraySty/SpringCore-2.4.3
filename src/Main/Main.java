package main;
import java.util.logging.Logger;

import clases.Avion;
import clases.Helice;
import clases.Turbina;

public class Main {

	  static Logger logger = Logger.getLogger(Main.class.getClass().getName());
	
	public static void main(String[] args) {
		
												// Injeccion de dependencias
		Avion obj1 = new Avion(new Helice());
		logger.info(obj1.getMotor());
		logger.info(obj1.getPotencia(270));
		
												// Injeccion de dependencias
		Avion obj2 = new Avion(new Turbina());
		logger.info(obj2.getMotor());
		logger.info(obj2.getPotencia(540));
		
	}
	
}
