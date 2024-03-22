package clases;

import interfaces.TiposMotor;

public class Turbina implements TiposMotor{

	@Override
	public String getTipo() {
		return "Turbina";
	}

	@Override
	public String getPotencia(int potencia) {
		return potencia + " kn";
	}

}
