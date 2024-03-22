package Clases;

import Interfaces.TiposMotor;

public class Avion {

	TiposMotor motor;

	public Avion(TiposMotor motor) {
		this.motor = motor;
	}

	public String getMotor() {
		return "El tipo de motor es: " + motor.getTipo();
	}
	
	public String getPotencia(int potencia) {
		return "El motor tiene una velocidad maxima de: " + motor.getPotencia(potencia);
		
	}
	
}
